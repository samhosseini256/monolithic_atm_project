package com.example.atm.person.service;

import com.example.atm.account.dao.AccountDao;
import com.example.atm.account.model.AccountModel;
import com.example.atm.person.dao.PersonDao;
import com.example.atm.person.domain.Person;
import com.example.atm.person.model.PersonModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//TODO add @Valid
@Service
@Transactional
public class PersonServiceImpl{

    @Autowired
    private PersonDao personDao;

    @Autowired
    private AccountDao accountDao;

    public PersonModel savePerson(PersonModel model) {

        Person person = new Person();
        BeanUtils.copyProperties(model,person);
        personDao.save(person);
        return model;

    }

    public PersonModel updatePerson(PersonModel model) {

        Person person = personDao.findPersonByNationalCode(model.getNationalCode());
        BeanUtils.copyProperties(model,person);
        personDao.updatePerson(model.getNationalCode(),model.getFirstName(),model.getLastName(), model.getPhoneNumber(),model.getAddress());
        return model;

    }

    public void deletePerson(String nationalCode) {

        personDao.deletePersonByNationalCode(nationalCode);

    }

    public List<AccountModel> allPersonAccounts(String nationalCode){

        return null;

    }

}

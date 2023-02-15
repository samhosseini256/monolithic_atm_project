package com.example.atm.person.service;

import com.example.atm.person.model.PersonModel;

public interface PersonService {

    PersonModel savePerson(PersonModel model);

    public PersonModel updatePerson(String nationalCode,
                                    String firstName,
                                    String lastName,
                                    String phoneNumber,
                                    String address);

    void deletePerson(String nationalCode);


}
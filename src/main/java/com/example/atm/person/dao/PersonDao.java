package com.example.atm.person.dao;

import com.example.atm.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person,Long> {

    Person findPersonByNationalCode(String nationalCode);

    @Modifying
    @Query("update Person p set p.firstName = ?2, p.lastName = ?3, p.phoneNumber=?4, p.address=?5 where p.nationalCode = ?1")
    void updatePerson(String nationalCode, String firstName, String lastName, String phoneNumber, String address);

    void deletePersonByNationalCode(String nationalCode);
}

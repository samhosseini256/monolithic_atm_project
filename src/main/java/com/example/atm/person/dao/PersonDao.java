package com.example.atm.person.dao;

import com.example.atm.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Long> {

}

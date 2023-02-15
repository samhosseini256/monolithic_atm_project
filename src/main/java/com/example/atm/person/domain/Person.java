package com.example.atm.person.domain;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tb_person")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "national_code", nullable = false, unique = true)
    private String nationalCode;

    @Column(name = "bith_date",nullable = false,updatable = false)
    private LocalDate birthDate;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "address", nullable = false)
    private String address;

}
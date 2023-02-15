package com.example.atm.person.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonModel {

    private String nationalCode;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

}

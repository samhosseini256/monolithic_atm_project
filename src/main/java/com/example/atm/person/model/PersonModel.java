package com.example.atm.person.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonModel {

    private String nationalCode;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

}

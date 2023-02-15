package com.example.atm.account.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountModel {

    private long personId;
    private String accNumber;
    private long balance;
    private long limitNormalTransfer;
    private long limitPayaTransfer;

}
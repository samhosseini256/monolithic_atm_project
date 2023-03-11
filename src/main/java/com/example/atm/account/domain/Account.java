package com.example.atm.account.domain;

import lombok.*;
import javax.persistence.*;

@Table(name = "tb_account")
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "owner_id",nullable = false)
    private long ownerId;

    @Column(name = "account_number",nullable = false, unique = true)
    private String AccountNumber;

    @Column(name = "balance",nullable = false)
    private long balance;

    @Column(name = "limit_normal_transfer",nullable = false)
    private long limitNormalTransfer;

    @Column(name = "limit_paya_transfer",nullable = false)
    private long limitPayaTransfer;


}
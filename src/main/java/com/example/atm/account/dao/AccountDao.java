package com.example.atm.account.dao;

import com.example.atm.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<Account,Long> {

    List<Account> findAccountsByAccountNumber(String accountNumber);

}

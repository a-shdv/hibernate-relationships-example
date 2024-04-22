package com.example.demo.model.dto;

import com.example.demo.model.Account;
import com.example.demo.model.User;

public record AccountDto() {
    public AccountDto() {
    }

    public static Account toAccount(AccountDto accountDto) {
        return Account.builder().build();
    }

}
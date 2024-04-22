package com.example.demo.model.dto;

import com.example.demo.model.Account;
import com.example.demo.model.User;

public record AccountUserDto(String username) {

    public AccountUserDto(String username) {
        this.username = username;
    }

//    public static Account toAccount(AccountUserDto accountUserDto) {
//        return Account.builder()
//                .user(accountUserDto.user())
//                .build();
//    }
}

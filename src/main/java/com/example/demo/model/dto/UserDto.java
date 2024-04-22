package com.example.demo.model.dto;

import com.example.demo.model.User;

public record UserDto(String email, String username, String password) {
    public UserDto(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public static User toUser(UserDto userDto) {
        return User.builder()
                .email(userDto.email())
                .username(userDto.username())
                .password(userDto.password())
                .build();
    }
}

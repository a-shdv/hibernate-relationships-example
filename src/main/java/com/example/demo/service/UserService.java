package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.AccountDto;
import com.example.demo.model.dto.UserDto;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    @Transactional
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Transactional
    public User save(UserDto userDto) {
        return userRepo.save(UserDto.toUser(userDto));
    }


}

package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    @Transactional
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Transactional
    public UserDto save(UserDto userDto) {
        userRepo.save(UserDto.toUser(userDto));
        return userDto;
    }

}

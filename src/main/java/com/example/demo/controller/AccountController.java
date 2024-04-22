package com.example.demo.controller;

import com.example.demo.model.dto.AccountDto;
import com.example.demo.model.dto.AccountUserDto;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(accountService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AccountDto accountDto) {
        return ResponseEntity.ok().body(accountService.save(accountDto));
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> save(@PathVariable UUID id, @RequestBody AccountUserDto accountUserDto) {
        return ResponseEntity.ok().body(accountService.save(id, accountUserDto));
    }
}
//acc 3c30f6d1-65dd-4b9d-bd77-e7818fae0b34
//        8d607004-c71e-49d2-af39-330f1ff104db
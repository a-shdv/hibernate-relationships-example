package com.example.demo.controller;

import com.example.demo.model.dto.AccountDto;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

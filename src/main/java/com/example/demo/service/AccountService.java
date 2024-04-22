package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.model.dto.AccountDto;
import com.example.demo.repo.AccountRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepo accountRepo;

    @Transactional
    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    @Transactional
    public AccountDto save(AccountDto accountDto) {
        accountRepo.save(AccountDto.toAccount(accountDto));
        return accountDto;
    }
}

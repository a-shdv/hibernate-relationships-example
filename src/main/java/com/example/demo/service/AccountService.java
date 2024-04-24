package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.model.User;
import com.example.demo.model.dto.AccountDto;
import com.example.demo.model.dto.AccountUserDto;
import com.example.demo.repo.AccountRepo;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepo accountRepo;
    private final UserRepo userRepo;

    @Transactional
    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    @Transactional
    public AccountDto save(AccountDto accountDto) {
        accountRepo.save(AccountDto.toAccount(accountDto));
        return accountDto;
    }

    @Transactional
    public AccountUserDto save(UUID id, AccountUserDto accountUserDto) {
        Optional<Account> account = accountRepo.findById(id);
        if (account.isPresent()) {
            Optional<User> user = userRepo.findByUsername(accountUserDto.username());
            if (user.isPresent()) {
                account.get().setUser(user.get());
                user.get().getAccounts().add(account.get());
                accountRepo.save(account.get());
            }
        }
        return accountUserDto;
    }
}

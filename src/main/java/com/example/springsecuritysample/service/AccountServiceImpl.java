package com.example.springsecuritysample.service;

import com.example.springsecuritysample.entity.Account;
import com.example.springsecuritysample.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Account registerAccount(Account account) {
        return accountRepository.save(account);
    }
}

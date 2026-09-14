package com.alireza.ledger.service;

import com.alireza.ledger.dto.AccountResponse;
import com.alireza.ledger.dto.CreateAccountRequest;
import com.alireza.ledger.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    private final AccountRepository accountRepository;

    @Transactional
    public AccountResponse create(CreateAccountRequest request) {
        // Account aus request.name() und request.currency() bauen
        // speichern
        // AccountResponse daraus bauen und zurückgeben
    }
}
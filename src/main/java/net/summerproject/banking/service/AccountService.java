package net.summerproject.banking.service;

import java.util.List;

import net.summerproject.banking.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id , double amount);

    AccountDto withdraw(Long id , double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
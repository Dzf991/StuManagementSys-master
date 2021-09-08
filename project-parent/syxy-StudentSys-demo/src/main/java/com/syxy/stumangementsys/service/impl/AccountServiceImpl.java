package com.syxy.stumangementsys.service.impl;

import com.syxy.stumangementsys.entities.Account;
import com.syxy.stumangementsys.mapper.AccountMapper;
import com.syxy.stumangementsys.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account login(Account account) {

        Account account1 = accountMapper.getAccount(account);


        return account1;
    }
}

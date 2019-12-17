package com.jtl.service.impl;

import com.jtl.domain.Account;
import com.jtl.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JT.L
 * @date 2019/12/17 14:29:05
 * @description
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户...");
    }
}

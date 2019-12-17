package com.jtl.service;

import com.jtl.domain.Account;

import java.util.List;

/**
 * @author JT.L
 * @date 2019/12/17 14:28:12
 * @description
 */
public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}

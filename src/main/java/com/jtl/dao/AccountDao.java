package com.jtl.dao;

import com.jtl.domain.Account;

import java.util.List;

/**
 * @author JT.L
 * @date 2019/12/17 14:24:20
 * @description 账户dao接口
 */
public interface AccountDao {
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

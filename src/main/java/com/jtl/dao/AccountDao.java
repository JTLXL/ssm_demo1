package com.jtl.dao;

import com.jtl.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JT.L
 * @date 2019/12/17 14:24:20
 * @description 账户dao接口
 */
@Repository //交给IOC容器
public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}

package com.jtl.test;

import com.jtl.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JT.L
 * @date 2019/12/17 14:53:21
 * @description
 */
public class TestSpring {
    @Test
    public void test1() {
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.findAll();

    }
}

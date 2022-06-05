package com.huaqi.zhanxin.service.impl;

import com.huaqi.zhanxin.ZhanxinApplication;
import com.huaqi.zhanxin.ZhanxinApplicationTests;
import com.huaqi.zhanxin.mapper.AccountMapper;
import com.huaqi.zhanxin.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZhanxinApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AccountServiceImplTest{
    @Resource
    private AccountService accountService;
    @Transactional
    @Rollback
    @Test
    void getAccountList() {
        System.out.println(this.accountService.getAccountList("1",10,10));

    }

    @Test
    void modifyAccountAuthority() {
        System.out.println(this.accountService.modifyAccountAuthority(3,1));
    }

    @Test
    void deactivateAccount() {

    }
}
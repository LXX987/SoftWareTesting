package com.huaqi.zhanxin.service.impl;

import com.huaqi.zhanxin.ZhanxinApplication;
import com.huaqi.zhanxin.ZhanxinApplicationTests;
import com.huaqi.zhanxin.entity.Credit;
import com.huaqi.zhanxin.mapper.AccountMapper;
import com.huaqi.zhanxin.service.AccountService;
import com.huaqi.zhanxin.service.CreditService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureMockMvc
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZhanxinApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreditServiceImplTest {
    @Autowired
    private MockMvc mockMvc;
    private MockHttpServletRequest request = new MockHttpServletRequest();
    @Autowired
    private CreditService creditService;
    @Autowired
    private WebApplicationContext wac;
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    public static String CASE_NUM;
    @Test
    public void testUserCredit1() {
        CASE_NUM = "UC_TC_004_001_001";
        log.info(CASE_NUM);
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","2590@2590.com")
                    .param("userPwd","123456")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            try {
                Credit credit = creditService.selectScore(21);
                log.info("true");
                log.info(mvcResult.getResponse().getContentAsString());
            } catch (Exception e) {
                log.info("false");
            }

            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

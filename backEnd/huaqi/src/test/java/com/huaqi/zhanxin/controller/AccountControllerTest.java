package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.ZhanxinApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@AutoConfigureMockMvc
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZhanxinApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AccountControllerTest {

    @Autowired
    private AccountController accountController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAccountList() {
        MvcResult mvcResult = null;
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/admin/accounts")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("type","0")
                            .param("pageNum","1")
                            .param("pageSize","10"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void modifyAccountAuthority() {
    }

    @Test
    void deactivateAccount() {
    }
}
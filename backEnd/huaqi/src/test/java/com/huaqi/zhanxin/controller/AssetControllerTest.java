package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.ZhanxinApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
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
class AssetControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private MockHttpServletRequest request;

    @Test
    void userList() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/asset/assetList")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("request", String.valueOf(request)))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void insertAsset() {
    }

    @Test
    void getMoney() {
    }

    @Test
    void deleteAsset() {
    }

    @Test
    void updateAsset() {
    }

    @Test
    void countAsset() {
    }
}
package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.ZhanxinApplication;
import com.huaqi.zhanxin.entity.Asset;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@AutoConfigureMockMvc
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZhanxinApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AssetControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private MockHttpServletRequest request = new MockHttpServletRequest();
    @Autowired
    private WebApplicationContext wac;
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    void userList() {
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                            .get("/asset/assetList")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
                    ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
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
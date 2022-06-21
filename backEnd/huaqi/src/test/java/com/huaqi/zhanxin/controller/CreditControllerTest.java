package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.ZhanxinApplication;
import com.huaqi.zhanxin.entity.Asset;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.annotation.Rollback;
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
public class CreditControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private MockHttpServletRequest request = new MockHttpServletRequest();
    @Autowired
    private WebApplicationContext wac;
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    public static String CASE_NUM;

    @Test
    public void testGetUserId1() {
        CASE_NUM = "UC_TC_004_001_001";
        log.info(CASE_NUM);
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/userCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token",""))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserId2() {
        CASE_NUM = "UC_TC_004_001_002";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/userCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIyNTkwMTY4NDExQHFxLmNvbSIsImV4cCI6MTY1NTg2NDMyNiwidXNlcklkIjoiMiJ9.waJH04Dhb5NXZLvMYqdCZvlQctS2lxjvPDTMQlI68iw"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserId3() {
        CASE_NUM = "UC_TC_004_001_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "8"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/userCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIzNDM0ODM0QDEyNi5jb20iLCJleHAiOjE2NTU4ODQyMzksInVzZXJJZCI6IjgifQ.Nw-VWKPU8T_p5WzMFVVWUTc6mo15DcVUERZ-PTLb9aA"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserId4() {
        CASE_NUM = "UC_TC_004_001_004";
        log.info(CASE_NUM);
        request.addParameter("userId", "2"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/userCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIyNTkwMTY4NDExQHFxLmNvbSIsImV4cCI6MTY1NTg4NDQzOSwidXNlcklkIjoiMiJ9.qUI-6xl_CNslfoSPxqjiKkvCr7kZcWXyx75c1-KsxnM"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllCredit1() {
        CASE_NUM = "UC_TC_004_002_001";
        log.info(CASE_NUM);
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/getAllCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIyNTkwMTY4NDExQHFxLmNvbSIsImV4cCI6MTY1NTg4NDQzOSwidXNlcklkIjoiMiJ9.qUI-6xl_CNslfoSPxqjiKkvCr7kZcWXyx75c1-KsxnM"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllCredit2() {
        CASE_NUM = "UC_TC_004_002_002";
        log.info(CASE_NUM);
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/getAllCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIyNTkwMTY4NDExQHFxLmNvbSIsImV4cCI6MTY1NTg4NDQzOSwidXNlcklkIjoiMiJ9.qUI-6xl_CNslfoSPxqjiKkvCr7kZcWXyx75c1-KsxnM"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllCredit3() {
        CASE_NUM = "UC_TC_004_002_003";
        log.info(CASE_NUM);
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/getAllCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIyNTkwMTY4NDExQHFxLmNvbSIsImV4cCI6MTY1NTkxMTg4MCwidXNlcklkIjoiMiJ9.3rFFb1fBkGkCmoWU_AiqqJ6vFpTE6bzfM6XwMYWn3ic"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllCredit4() {
        CASE_NUM = "UC_TC_004_002_004";
        log.info(CASE_NUM);
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/credit/getAllCredit")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIyNTkwMTY4NDExQHFxLmNvbSIsImV4cCI6MTY1NTg4NDQzOSwidXNlcklkIjoiMiJ9.qUI-6xl_CNslfoSPxqjiKkvCr7kZcWXyx75c1-KsxnM"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

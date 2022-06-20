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

    public static String CASE_NUM;

    @Test
    void userList_UC_TC_001_001_001() {
        CASE_NUM = "UC_TC_001_001_001";
        log.info(CASE_NUM);
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                            .get("/asset/assetList")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIwOTg3MTIzMzAwQHFxLmNvbSIsImV4cCI6MTY1NTgxMjI4MiwidXNlcklkIjoiMTUifQ.giq0oNWGebav9M2bALgFxbTgpz3IKjCd1Y5lHzWDvRE")
                    ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    void userList_UC_TC_001_001_002() {
        CASE_NUM = "UC_TC_001_001_002";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .get("/asset/assetList")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void userList_UC_TC_001_001_003() {
        CASE_NUM = "UC_TC_001_001_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "15"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .get("/asset/assetList")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIwOTg3MTIzMzAwQHFxLmNvbSIsImV4cCI6MTY1NTgxMjI4MiwidXNlcklkIjoiMTUifQ.giq0oNWGebav9M2bALgFxbTgpz3IKjCd1Y5lHzWDvRE")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void userList_UC_TC_001_001_004() {
        CASE_NUM = "UC_TC_001_001_004";
        log.info(CASE_NUM);
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
    void insertAsset_UT_TD_002_001() {
        CASE_NUM = "UC_TC_001_002_001";
        log.info(CASE_NUM);
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","中国银行")
                    .param("money","11000")
                    .header("token","eyJ0eXAiOiJgc8QiLCJhbGciOipo0zI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void insertAsset_UT_TD_002_002_001() {
        CASE_NUM = "UC_TC_001_002_002_001";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","中国银行")
                    .param("money","11000")
                    .header("token","")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void insertAsset_UT_TD_002_002_002() {
        CASE_NUM = "UC_TC_001_002_002_002";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","")
                    .param("money","11000")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void insertAsset_UT_TD_002_002_003() {
        CASE_NUM = "UC_TC_001_002_002_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","中国银行")
                    .param("money","")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void insertAsset_UT_TD_002_003() {
        CASE_NUM = "UC_TC_001_002_002_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","同济银行")
                    .param("money","11000")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void insertAsset_UT_TD_002_004() {
        CASE_NUM = "UC_TC_001_002_002_004";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","中国银行")
                    .param("money","-1560")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void insertAsset_UT_TD_002_005() {
        CASE_NUM = "UC_TC_001_002_002_005";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/insertAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("bank","中国农业银行")
                    .param("money","15600")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getMoney_UT_TD_003_001() {
        CASE_NUM = "UC_TC_001_003_001";
        log.info(CASE_NUM);
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .get("/asset/getMoney")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV2QsLCJubGciOiJlUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getMoney_UT_TD_003_002() {
        CASE_NUM = "UC_TC_001_003_002";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .get("/asset/getMoney")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getMoney_UT_TD_003_003() {
        CASE_NUM = "UC_TC_001_003_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "15"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .get("/asset/getMoney")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIwOTg3MTIzMzAwQHFxLmNvbSIsImV4cCI6MTY1NTgxMjI4MiwidXNlcklkIjoiMTUifQ.giq0oNWGebav9M2bALgFxbTgpz3IKjCd1Y5lHzWDvRE")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getMoney_UT_TD_003_004() {
        CASE_NUM = "UC_TC_001_003_004";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .get("/asset/getMoney")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void deleteAsset_UT_TD_004_001() {
        CASE_NUM = "UC_TC_001_004_001";
        log.info(CASE_NUM);
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/deleteAsset")
                    .param("addTime","2022-2-15 12:15:00")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV2QsLCJubGciOiJlUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void deleteAsset_UT_TD_004_002_001() {
        CASE_NUM = "UC_TC_001_004_002_001";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/deleteAsset")
                    .param("addTime","2022-2-15 12:15:00")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Rollback()
    @Test
    void deleteAsset_UT_TD_004_002_002() {
        CASE_NUM = "UC_TC_001_004_002_002";
        log.info(CASE_NUM);
        request.addParameter("userId", "2"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/deleteAsset")
                    .param("addTime","")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV2QsLCJubGciOiJlUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void deleteAsset_UT_TD_004_003() {
        CASE_NUM = "UC_TC_001_003_004";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/deleteAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("addTime","2002-06-07 18:24:12")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void deleteAsset_UT_TD_004_004() {
        CASE_NUM = "UC_TC_001_004_004";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/deleteAsset")
                    .accept(MediaType.APPLICATION_JSON)
                    .param("addTime","2022-06-05 17:42:21")
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Rollback()
    @Test
    void updateAsset_UT_TD_005_001() {
        CASE_NUM = "UC_TC_001_005_001";
        log.info(CASE_NUM);
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","2022-06-07 18:24:12")
                    .param("bank","工商银行")
                    .param("money","9999")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV2QsLCJubGciOiJlUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void updateAsset_UT_TD_005_002_001() {
        CASE_NUM = "UC_TC_001_005_002_001";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","2022-06-07 18:24:12")
                    .param("bank","工商银行")
                    .param("money","9999")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void updateAsset_UT_TD_005_002_002() {
        CASE_NUM = "UC_TC_001_005_002_002";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","")
                    .param("bank","")
                    .param("money","")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void updateAsset_UT_TD_005_003() {
        CASE_NUM = "UC_TC_001_005_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","2022-06-07 18:24:12")
                    .param("bank","工商银行")
                    .param("money","7300")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void updateAsset_UT_TD_005_004() {
        CASE_NUM = "UC_TC_001_005_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","2022-06-07 18:24:12")
                    .param("bank","国际银行")
                    .param("money","7300")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void updateAsset_UT_TD_005_005() {
        CASE_NUM = "UC_TC_001_005_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","2022-06-07 18:24:12")
                    .param("bank","中国银行")
                    .param("money","-15")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Rollback()
    @Test
    void updateAsset_UT_TD_005_006() {
        CASE_NUM = "UC_TC_001_005_003";
        log.info(CASE_NUM);
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/asset/updateAsset")
                    .param("addTime","2022-06-05 17:42:21")
                    .param("bank","中国银行")
                    .param("money","7300")
                    .accept(MediaType.APPLICATION_JSON)
                    .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1NzQzNDQ3LCJ1c2VySWQiOiIxIn0.ozVCzrbjCQz7EkdNbmXALIwMDdeW2wjRRbDt7DY61JI")
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
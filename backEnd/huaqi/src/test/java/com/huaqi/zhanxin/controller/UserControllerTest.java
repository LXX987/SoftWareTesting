package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.ZhanxinApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.junit.Test;
import javax.servlet.http.HttpServletRequest;

@AutoConfigureMockMvc
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZhanxinApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
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
//    String userEmail, String userPassword, Integer userType,
//    HttpServletRequest request, HttpServletResponse response

    @Test
    public void testRegister1() {
//        CASE_NUM = "UC_TC_001_005_002_001";
//        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","1234@1234.com")
                    .param("userPwd","123456")
                    .param("userType","0")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister2() {
//        CASE_NUM = "UC_TC_001_005_002_001";
//        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPwd","123456")
                    .param("userType","0")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

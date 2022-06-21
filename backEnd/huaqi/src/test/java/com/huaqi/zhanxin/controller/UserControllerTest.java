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

import javax.servlet.http.Cookie;
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
        CASE_NUM = "UC_TC_003_001_001";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","")
                    .param("userPwd","")
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
        CASE_NUM = "UC_TC_003_001_002";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","123456@12.com")
                    .param("userPwd","")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister3() {
        CASE_NUM = "UC_TC_003_001_003";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPwd","")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister4() {
        CASE_NUM = "UC_TC_003_001_004";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","")
                    .param("userPwd","123456")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister5() {
        CASE_NUM = "UC_TC_003_001_005";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","test123@test.com")
                    .param("userPwd","123456")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister6() {
        CASE_NUM = "UC_TC_003_001_006";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPwd","123456")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister7() {
        CASE_NUM = "UC_TC_003_001_007";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","2590168411@.com")
                    .param("userPwd","")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegister8() {
        CASE_NUM = "UC_TC_003_001_008";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/registerUser")
                    .param("userEmail","2590168411@.com")
                    .param("userPwd","123456")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin1() {
        CASE_NUM = "UC_TC_003_002_001";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","")
                    .param("userPassword","123456")
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
    public void testLogin2() {
        CASE_NUM = "UC_TC_003_002_002";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","")
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
    public void testLogin3() {
        CASE_NUM = "UC_TC_003_002_003";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
                    .param("userType","")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin4() {
        CASE_NUM = "UC_TC_003_002_004";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","1234")
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
    public void testLogin5() {
        CASE_NUM = "UC_TC_003_002_005";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
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
    public void testLogin6() {
        CASE_NUM = "UC_TC_003_002_006";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
                    .param("userType","-1")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin7() {
        CASE_NUM = "UC_TC_003_002_007";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
                    .param("userType","2")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin8() {
        CASE_NUM = "UC_TC_003_002_008";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","123@123.com")
                    .param("userPassword","123456")
                    .param("userType","1")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin9() {
        CASE_NUM = "UC_TC_003_002_009";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","123@123.com")
                    .param("userPassword","123456")
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
    public void testLogin10() {
        CASE_NUM = "UC_TC_003_002_010";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
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
    public void testLogin11() {
        CASE_NUM = "UC_TC_003_002_011";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
                    .param("userType","1")
                    .accept(MediaType.APPLICATION_JSON)
            ).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

            log.info(mvcResult.getResponse().getContentAsString());
            Thread.sleep(10*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLogin12() {
        CASE_NUM = "UC_TC_003_002_012";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","25168411@qq.com")
                    .param("userPassword","123456")
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
    public void testLogin13() {
        CASE_NUM = "UC_TC_003_002_013";
        log.info(CASE_NUM);
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                    .post("/user/login")
                    .param("userEmail","2590168411@qq.com")
                    .param("userPassword","123456")
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

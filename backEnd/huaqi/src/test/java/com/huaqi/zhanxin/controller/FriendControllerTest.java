package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.ZhanxinApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@AutoConfigureMockMvc
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZhanxinApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FriendControllerTest {

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
    void getFriendList1() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("pageNum","1")
                            .param("pageSize","10")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void getFriendList2() {
        MvcResult mvcResult = null;
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("pageNum","1")
                            .param("pageSize","10")
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
    void getFriendList3() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("pageNum","1")
                            .param("pageSize","10")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void getFriendList4() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("pageNum","1")
                            .param("pageSize","10")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void getFriendList5() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void getFriendList6() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("pageNum","0")
                            .param("pageSize","10")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void getFriendList7() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("pageNum","1")
                            .param("pageSize","-1")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void getMyCode1() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/codes")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void getMyCode2() {
        MvcResult mvcResult = null;
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/codes")
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
    void getMyCode3() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/codes")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void getMyCode4() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/codes")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void deleteFriend1() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("friend_id","1")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void deleteFriend2() {
        MvcResult mvcResult = null;
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("friend_id","1")
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
    void deleteFriend3() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("friend_id","1")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void deleteFriend4() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("friend_id","2")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void deleteFriend5() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/user/friends")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("friend_id","5")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void generate1() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/generareCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void generate2() {
        MvcResult mvcResult = null;
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/generareCode")
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
    void generate3() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/generareCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMzIyM0AxMjYuY29tIiwiZXhwIjoxNjU1ODE2ODA5LCJ1c2VySWQiOiI1In0.IxQNyYxDKULQUsJ0DlJxETPESVibJQ60m2YHZLbIcS8"))
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
    void generate4() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/generareCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void friendCode1() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "999"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","7RP56M")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void friendCode2() {
        MvcResult mvcResult = null;
        request.addParameter("userId", ""); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","7RP56M")
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
    void friendCode3() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","7RP56M")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void friendCode4() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","8J3X9G")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void friendCode5() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","TGQ24U")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void friendCode6() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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
    void friendCode7() {
        MvcResult mvcResult = null;
        request.addParameter("userId", "1"); //直接添加request参数，相当简单
        try {
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/InviteCode/friendCode")
                            .accept(MediaType.APPLICATION_JSON)
                            .param("invitedCode","123456")
                            .header("token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyRW1haWwiOiIxMjNAcXEuY29tIiwiZXhwIjoxNjU1ODE3MzkyLCJ1c2VySWQiOiIxIn0.G0VQSigkpVnuVzvN_Xq-PePUf2O6cIeBxSu0nLJCKZs"))
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

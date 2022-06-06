package com.huaqi.zhanxin.controller;

import com.huaqi.zhanxin.entity.PsychologyQuestionsBean;
import com.huaqi.zhanxin.service.PsychologyQuestionsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("psychologyQuestions")
public class PsychologyQuestionsController {
    @Autowired
    private PsychologyQuestionsService psychologyQuestionsService;

    @RequestMapping("show")
    public  List<PsychologyQuestionsBean> psychologyQuestionsList() {
        return  psychologyQuestionsService.psychologyQuestionsList();
    }

    @ApiOperation(value = "获取心理测评题目")
    @PostMapping("getQuestions")
    public Map<String, Object> getQuestions() {
        Map<String, Object> map = new HashMap<>();
        List<PsychologyQuestionsBean> psychologyQuestionsList = psychologyQuestionsService.psychologyQuestionsList();
            try {
                map.put("msg", "获取题目成功");
                map.put("questions", psychologyQuestionsList);
            } catch (Exception e) {
                map.put("msg", e.getMessage());
            }

            return map;

    }

}

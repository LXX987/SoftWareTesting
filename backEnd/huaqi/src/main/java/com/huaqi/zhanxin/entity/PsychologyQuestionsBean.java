package com.huaqi.zhanxin.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "Psychology_test对象")
public class PsychologyQuestionsBean {
    private Integer testID;
    private String testContent;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String option5;
    private Integer itemScore;

    public PsychologyQuestionsBean(Integer testID, String testContent, String option1, String option2,
                                   String option3, String option4, String option5, Integer itemScore) {
        this.testID = testID;
        this.testContent = testContent;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.itemScore = itemScore;
    }
}

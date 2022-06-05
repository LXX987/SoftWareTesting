package com.huaqi.zhanxin.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel(value = "psychology对象")
public class PsychologyBean {

    /**
     * 用户ID
     * @param: []
     * @return: java.util.Integer
     */
    private Integer userID;
    /**
     * 用户测试时间按
     * @param: []
     * @return: java.util.date
     */
    private Timestamp testTime;

    /**
     * 用户测试分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer testScore;

    /**
     * 用户开放性分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer openness;

    /**
     * 用户严谨性分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer conscientiousness;

    /**
     * 用户外倾性分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer extraversion;

    /**
     * 用户宜人性分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer agreeableness;

    /**
     * 用户神经质分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer neuroticism;

    /**
     * 用户资产证明分数
     * @param: userID
     * @param: testTime,
     * @param: testScore,
     * @param: openness,
     * @param: conscientiousness,
     * @param: extraversion,
     * @param: agreeableness,
     * @param: neuroticism
     *
     * @return: java.util.Integer
     */
    public PsychologyBean(Integer userID, Timestamp testTime, Integer testScore, Integer openness,
                          Integer conscientiousness, Integer extraversion, Integer agreeableness,
                          Integer neuroticism) {
        this.userID = userID;
        this.testTime = testTime;
        this.testScore = testScore;
        this.openness = openness;
        this.conscientiousness = conscientiousness;
        this.extraversion = extraversion;
        this.agreeableness = agreeableness;
        this.neuroticism = neuroticism;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Timestamp getTestTime() {
        return testTime;
    }

    public void setTestTime(Timestamp testTime) {
        this.testTime = testTime;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public Integer getOpenness() {
        return openness;
    }

    public void setOpenness(Integer openness) {
        this.openness = openness;
    }

    public Integer getConscientiousness() {
        return conscientiousness;
    }

    public void setConscientiousness(Integer conscientiousness) {
        this.conscientiousness = conscientiousness;
    }

    public Integer getExtraversion() {
        return extraversion;
    }

    public void setExtraversion(Integer extraversion) {
        this.extraversion = extraversion;
    }

    public Integer getAgreeableness() {
        return agreeableness;
    }

    public void setAgreeableness(Integer agreeableness) {
        this.agreeableness = agreeableness;
    }

    public Integer getNeuroticism() {
        return neuroticism;
    }

    public void setNeuroticism(Integer neuroticism) {
        this.neuroticism = neuroticism;
    }
}

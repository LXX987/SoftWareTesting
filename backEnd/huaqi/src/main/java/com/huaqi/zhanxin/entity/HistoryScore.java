package com.huaqi.zhanxin.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel(value = "user历史信用分数")
public class HistoryScore {
    /**
     * 用户ID
     * @param: []
     * @return: java.util.Integer
     */
    private Integer userID;

    /**
     * 用户总分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer totalScore;

    /**
     * 用户分数更新时间
     * @param: []
     * @return: java.util.Date
     */
    private Timestamp historyTime;

    /**
     * 用户身份信息分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer identityScore;

    /**
     * 用户资产证明分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer assetScore;

    /**
     * 用户信用分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer creditScore;

    /**
     * 用户行为积累分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer behaviorScore;

    /**
     * 用户社交分数
     * @param: []
     * @return: java.util.Integer
     */
    private Integer socialScore;

}

package com.huaqi.zhanxin.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel(value = "SystemMessage对象")
public class SystemMessageBean {
    private Integer messageId;
    private String messageTitle;
    private String messageContent;
    private Timestamp releaseTime;
}

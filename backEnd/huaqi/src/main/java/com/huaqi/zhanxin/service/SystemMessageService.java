package com.huaqi.zhanxin.service;

import com.huaqi.zhanxin.entity.*;
import java.sql.Timestamp;
import java.util.List;

public interface SystemMessageService {
    int insetSystemMessage(String messageTitle, String messageContent, Timestamp testTime);
    List<SystemMessageBean> getMessage();
}

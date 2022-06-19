package com.huaqi.zhanxin.service;

import com.huaqi.zhanxin.entity.PsychologyBean;

import java.sql.Timestamp;
import java.util.List;

public interface PsychologyService {
    List<PsychologyBean> psychologyList();

    List<PsychologyBean> getHistory(int userId);

    List<PsychologyBean> getResult(int userId);

    int recordScore(int userId, Timestamp testTime, int score1, int score2, int score3, int score4, int score5,
                    int score);

}

package com.huaqi.zhanxin.service;

import com.huaqi.zhanxin.entity.InviteCode;

import java.sql.Timestamp;

public interface InviteCodeService {
    InviteCode searchCode(String inviteCode);
    InviteCode searchUserCode(int userID);
    int insertCode(int userID, String inviteCode, Timestamp submitTime);
    int insertFriend(int userID, String invitedCode, Timestamp submitTime);

}

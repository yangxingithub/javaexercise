package com.yangxin.develop.usermanage.dto;

import com.yangxin.develop.common.BaseDTO;

public class UserInfoDTO extends BaseDTO{
    private String userId;

    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}
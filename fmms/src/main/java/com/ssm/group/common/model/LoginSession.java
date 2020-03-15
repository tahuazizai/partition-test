package com.ssm.group.common.model;

import com.ssm.group.entity.User;

import java.io.Serializable;


public class LoginSession implements Serializable {

    private static final long serialVersionUID = 1L;
    //用户对象
    private User user;

    //登录时间
    private String loginDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }
}

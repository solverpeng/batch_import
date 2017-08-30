package com.solverpeng.mybatis.model;

import com.solverpeng.mybatis.util.ExcelField;


public class CircleUser {
    /**
     * 主键
     */
    private String id;

    /**
     * 登录账号
     */
    @ExcelField(title = "登录账号", sort = 1)
    private String userName;

    /**
     * 昵称
     */
    @ExcelField(title = "昵称", sort = 2)
    private String nickName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}


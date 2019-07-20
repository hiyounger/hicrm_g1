package com.newroad.system.manage.entity;

import java.util.Date;

public class LoginHistory {
    private Long id;

    private Long userId;

    private Date loginTime;

    private String loginIp;

    private Short loginStatus;

    public LoginHistory(Long id, Long userId, Date loginTime, String loginIp, Short loginStatus) {
        this.id = id;
        this.userId = userId;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
        this.loginStatus = loginStatus;
    }

    public LoginHistory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Short getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Short loginStatus) {
        this.loginStatus = loginStatus;
    }
}
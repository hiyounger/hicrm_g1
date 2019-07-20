package com.newroad.entity;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private Date createtime;

    private String email;

    private String phone;

    private String salt;

    private Long sortnum;

    private Long status;

    private Date updatetime;

    private String usernote;

    private Long createby;

    private Long updateby;

    public User(Long id, String username, String password, Date createtime, String email, String phone, String salt, Long sortnum, Long status, Date updatetime, String usernote, Long createby, Long updateby) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.email = email;
        this.phone = phone;
        this.salt = salt;
        this.sortnum = sortnum;
        this.status = status;
        this.updatetime = updatetime;
        this.usernote = usernote;
        this.createby = createby;
        this.updateby = updateby;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Long getSortnum() {
        return sortnum;
    }

    public void setSortnum(Long sortnum) {
        this.sortnum = sortnum;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUsernote() {
        return usernote;
    }

    public void setUsernote(String usernote) {
        this.usernote = usernote == null ? null : usernote.trim();
    }

    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    public Long getUpdateby() {
        return updateby;
    }

    public void setUpdateby(Long updateby) {
        this.updateby = updateby;
    }
}
package com.newroad.system.manage.entity;

import java.util.Date;

public class EmailRecord {
    private Long id;

    private Long userId;

    private String toAddr;

    private String subject;

    private String content;

    private Date sendtime;

    private Short status;

    public EmailRecord(Long id, Long userId, String toAddr, String subject, String content, Date sendtime, Short status) {
        this.id = id;
        this.userId = userId;
        this.toAddr = toAddr;
        this.subject = subject;
        this.content = content;
        this.sendtime = sendtime;
        this.status = status;
    }

    public EmailRecord() {
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

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr == null ? null : toAddr.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
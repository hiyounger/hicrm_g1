package com.jingtang.manage.message.entity;

import java.util.Date;

public class Message {
    private Long id;

    private Long toUserId;

    private Long fromUserId;

    private String content;

    private Date readTime;

    private Date sendTime;

    private Short status;

    public Message(Long id, Long toUserId, Long fromUserId, String content, Date readTime, Date sendTime, Short status) {
        this.id = id;
        this.toUserId = toUserId;
        this.fromUserId = fromUserId;
        this.content = content;
        this.readTime = readTime;
        this.sendTime = sendTime;
        this.status = status;
    }

    public Message() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
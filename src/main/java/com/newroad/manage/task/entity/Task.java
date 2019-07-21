package com.newroad.manage.task.entity;

import java.util.Date;

public class Task {
    private Long id;

    private Long ownerUserId;

    private String aboutUsers;

    private String subject;

    private Date dueDate;

    private String status;

    private String priority;

    private String sendEmail;

    private String description;

    private Long creatorUserId;

    private Date createDate;

    private Date updateDate;

    private Short isclose;

    private Short deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

    public Task(Long id, Long ownerUserId, String aboutUsers, String subject, Date dueDate, String status, String priority, String sendEmail, String description, Long creatorUserId, Date createDate, Date updateDate, Short isclose, Short deleteStatus, Long deleteUserId, Date deleteTime) {
        this.id = id;
        this.ownerUserId = ownerUserId;
        this.aboutUsers = aboutUsers;
        this.subject = subject;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
        this.sendEmail = sendEmail;
        this.description = description;
        this.creatorUserId = creatorUserId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.isclose = isclose;
        this.deleteStatus = deleteStatus;
        this.deleteUserId = deleteUserId;
        this.deleteTime = deleteTime;
    }

    public Task() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getAboutUsers() {
        return aboutUsers;
    }

    public void setAboutUsers(String aboutUsers) {
        this.aboutUsers = aboutUsers == null ? null : aboutUsers.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail == null ? null : sendEmail.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Short getIsclose() {
        return isclose;
    }

    public void setIsclose(Short isclose) {
        this.isclose = isclose;
    }

    public Short getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Long getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(Long deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
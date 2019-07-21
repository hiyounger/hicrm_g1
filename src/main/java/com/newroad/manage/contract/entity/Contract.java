package com.newroad.manage.contract.entity;

import java.util.Date;

public class Contract {
    private Long id;

    private String num;

    private Short price;

    private Date dueTime;

    private Long ownerUserId;

    private Long creatorUserId;

    private String content;

    private String description;

    private Date createTime;

    private Date updateTime;

    private Date startDate;

    private Date endDate;

    private String status;

    private Short deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

    public Contract(Long id, String num, Short price, Date dueTime, Long ownerUserId, Long creatorUserId, String content, String description, Date createTime, Date updateTime, Date startDate, Date endDate, String status, Short deleteStatus, Long deleteUserId, Date deleteTime) {
        this.id = id;
        this.num = num;
        this.price = price;
        this.dueTime = dueTime;
        this.ownerUserId = ownerUserId;
        this.creatorUserId = creatorUserId;
        this.content = content;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.deleteStatus = deleteStatus;
        this.deleteUserId = deleteUserId;
        this.deleteTime = deleteTime;
    }

    public Contract() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public Short getPrice() {
        return price;
    }

    public void setPrice(Short price) {
        this.price = price;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
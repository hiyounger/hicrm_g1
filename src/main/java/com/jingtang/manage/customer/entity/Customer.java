package com.jingtang.manage.customer.entity;

import java.util.Date;

public class Customer {
    private Long id;

    private Long ownerUserId;

    private Long creatorUserId;

    private String name;

    private String origin;

    private String address;

    private String zipCode;

    private String industry;

    private String annualRevenue;

    private String ownership;

    private String rating;

    private Date createTime;

    private Date updateTime;

    private Short deleteStatus;

    private Short isLocked;

    private Long deleteUserId;

    private Date deleteTime;

    public Customer(Long id, Long ownerUserId, Long creatorUserId, String name, String origin, String address, String zipCode, String industry, String annualRevenue, String ownership, String rating, Date createTime, Date updateTime, Short deleteStatus, Short isLocked, Long deleteUserId, Date deleteTime) {
        this.id = id;
        this.ownerUserId = ownerUserId;
        this.creatorUserId = creatorUserId;
        this.name = name;
        this.origin = origin;
        this.address = address;
        this.zipCode = zipCode;
        this.industry = industry;
        this.annualRevenue = annualRevenue;
        this.ownership = ownership;
        this.rating = rating;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteStatus = deleteStatus;
        this.isLocked = isLocked;
        this.deleteUserId = deleteUserId;
        this.deleteTime = deleteTime;
    }

    public Customer() {
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

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue == null ? null : annualRevenue.trim();
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
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

    public Short getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Short getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Short isLocked) {
        this.isLocked = isLocked;
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
package com.newroad.system.manage.entity;

import java.util.Date;

public class Bussiness {
    private Long id;

    private String name;

    private String origin;

    private String type;

    private Long estimatePrice;

    private Long customerId;

    private Long creatorUserId;

    private Long ownerUserId;

    private Short gainRate;

    private Long totalAmount;

    private Double subtotalVal;

    private Double discountPrice;

    private Double salesPrice;

    private Date dueDate;

    private Date createTime;

    private Date updateTime;

    private Long updateUserId;

    private Long statusId;

    private Double totalPrice;

    private String nextstep;

    private Date nextstepTime;

    private Short deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

    private Long contactsId;

    private String contractAddress;

    private String description;

    public Bussiness(Long id, String name, String origin, String type, Long estimatePrice, Long customerId, Long creatorUserId, Long ownerUserId, Short gainRate, Long totalAmount, Double subtotalVal, Double discountPrice, Double salesPrice, Date dueDate, Date createTime, Date updateTime, Long updateUserId, Long statusId, Double totalPrice, String nextstep, Date nextstepTime, Short deleteStatus, Long deleteUserId, Date deleteTime, Long contactsId, String contractAddress, String description) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.estimatePrice = estimatePrice;
        this.customerId = customerId;
        this.creatorUserId = creatorUserId;
        this.ownerUserId = ownerUserId;
        this.gainRate = gainRate;
        this.totalAmount = totalAmount;
        this.subtotalVal = subtotalVal;
        this.discountPrice = discountPrice;
        this.salesPrice = salesPrice;
        this.dueDate = dueDate;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.updateUserId = updateUserId;
        this.statusId = statusId;
        this.totalPrice = totalPrice;
        this.nextstep = nextstep;
        this.nextstepTime = nextstepTime;
        this.deleteStatus = deleteStatus;
        this.deleteUserId = deleteUserId;
        this.deleteTime = deleteTime;
        this.contactsId = contactsId;
        this.contractAddress = contractAddress;
        this.description = description;
    }

    public Bussiness() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getEstimatePrice() {
        return estimatePrice;
    }

    public void setEstimatePrice(Long estimatePrice) {
        this.estimatePrice = estimatePrice;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Short getGainRate() {
        return gainRate;
    }

    public void setGainRate(Short gainRate) {
        this.gainRate = gainRate;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getSubtotalVal() {
        return subtotalVal;
    }

    public void setSubtotalVal(Double subtotalVal) {
        this.subtotalVal = subtotalVal;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNextstep() {
        return nextstep;
    }

    public void setNextstep(String nextstep) {
        this.nextstep = nextstep == null ? null : nextstep.trim();
    }

    public Date getNextstepTime() {
        return nextstepTime;
    }

    public void setNextstepTime(Date nextstepTime) {
        this.nextstepTime = nextstepTime;
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

    public Long getContactsId() {
        return contactsId;
    }

    public void setContactsId(Long contactsId) {
        this.contactsId = contactsId;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
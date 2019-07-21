package com.newroad.manage.lead.entity;

import java.util.Date;

public class Leads {
    private Long id;

    private Long ownerUserId;

    private Long creatorUserId;

    private String name;

    private String position;

    private String contactsName;

    private String saltname;

    private String mobile;

    private String email;

    private Date createTime;

    private Date updateTime;

    private Short deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

    private Short isTransformed;

    private Long transformUserId;

    private Long contactsId;

    private Long customerId;

    private Long businessId;

    private String nextstep;

    private Date nextstepTime;

    private Date haveTime;

    private String address;

    private String source;

    private String leadnote;

    public Leads(Long id, Long ownerUserId, Long creatorUserId, String name, String position, String contactsName, String saltname, String mobile, String email, Date createTime, Date updateTime, Short deleteStatus, Long deleteUserId, Date deleteTime, Short isTransformed, Long transformUserId, Long contactsId, Long customerId, Long businessId, String nextstep, Date nextstepTime, Date haveTime, String address, String source, String leadnote) {
        this.id = id;
        this.ownerUserId = ownerUserId;
        this.creatorUserId = creatorUserId;
        this.name = name;
        this.position = position;
        this.contactsName = contactsName;
        this.saltname = saltname;
        this.mobile = mobile;
        this.email = email;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteStatus = deleteStatus;
        this.deleteUserId = deleteUserId;
        this.deleteTime = deleteTime;
        this.isTransformed = isTransformed;
        this.transformUserId = transformUserId;
        this.contactsId = contactsId;
        this.customerId = customerId;
        this.businessId = businessId;
        this.nextstep = nextstep;
        this.nextstepTime = nextstepTime;
        this.haveTime = haveTime;
        this.address = address;
        this.source = source;
        this.leadnote = leadnote;
    }

    public Leads() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getSaltname() {
        return saltname;
    }

    public void setSaltname(String saltname) {
        this.saltname = saltname == null ? null : saltname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public Short getIsTransformed() {
        return isTransformed;
    }

    public void setIsTransformed(Short isTransformed) {
        this.isTransformed = isTransformed;
    }

    public Long getTransformUserId() {
        return transformUserId;
    }

    public void setTransformUserId(Long transformUserId) {
        this.transformUserId = transformUserId;
    }

    public Long getContactsId() {
        return contactsId;
    }

    public void setContactsId(Long contactsId) {
        this.contactsId = contactsId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
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

    public Date getHaveTime() {
        return haveTime;
    }

    public void setHaveTime(Date haveTime) {
        this.haveTime = haveTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getLeadnote() {
        return leadnote;
    }

    public void setLeadnote(String leadnote) {
        this.leadnote = leadnote == null ? null : leadnote.trim();
    }
}
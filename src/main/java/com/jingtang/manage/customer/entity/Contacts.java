package com.jingtang.manage.customer.entity;

import java.util.Date;

public class Contacts {
    private Long id;

    private Long creatorUserId;

    private String name;

    private String post;

    private String department;

    private Short sex;

    private String saltname;

    private String telephone;

    private String email;

    private String qqNo;

    private String address;

    private String zipCode;

    private String description;

    private Long customerId;

    private Date createTime;

    private Date updateTime;

    private Short deleteStatus;

    private Long deleteUserId;

    private Date deleteTime;

    public Contacts(Long id, Long creatorUserId, String name, String post, String department, Short sex, String saltname, String telephone, String email, String qqNo, String address, String zipCode, String description, Long customerId, Date createTime, Date updateTime, Short deleteStatus, Long deleteUserId, Date deleteTime) {
        this.id = id;
        this.creatorUserId = creatorUserId;
        this.name = name;
        this.post = post;
        this.department = department;
        this.sex = sex;
        this.saltname = saltname;
        this.telephone = telephone;
        this.email = email;
        this.qqNo = qqNo;
        this.address = address;
        this.zipCode = zipCode;
        this.description = description;
        this.customerId = customerId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteStatus = deleteStatus;
        this.deleteUserId = deleteUserId;
        this.deleteTime = deleteTime;
    }

    public Contacts() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getSaltname() {
        return saltname;
    }

    public void setSaltname(String saltname) {
        this.saltname = saltname == null ? null : saltname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQqNo() {
        return qqNo;
    }

    public void setQqNo(String qqNo) {
        this.qqNo = qqNo == null ? null : qqNo.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
}
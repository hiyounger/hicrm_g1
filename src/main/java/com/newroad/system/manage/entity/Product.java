package com.newroad.system.manage.entity;

import java.util.Date;

public class Product {
    private Long id;

    private Long categoryId;

    private String name;

    private Long creatorUserId;

    private Double costPrice;

    private Double suggestedPrice;

    private String developmentTeam;

    private Date developmentTime;

    private String link;

    private Date createTime;

    private Date updateTime;

    private String description;

    public Product(Long id, Long categoryId, String name, Long creatorUserId, Double costPrice, Double suggestedPrice, String developmentTeam, Date developmentTime, String link, Date createTime, Date updateTime, String description) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.creatorUserId = creatorUserId;
        this.costPrice = costPrice;
        this.suggestedPrice = suggestedPrice;
        this.developmentTeam = developmentTeam;
        this.developmentTime = developmentTime;
        this.link = link;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.description = description;
    }

    public Product() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(Double suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public String getDevelopmentTeam() {
        return developmentTeam;
    }

    public void setDevelopmentTeam(String developmentTeam) {
        this.developmentTeam = developmentTeam == null ? null : developmentTeam.trim();
    }

    public Date getDevelopmentTime() {
        return developmentTime;
    }

    public void setDevelopmentTime(Date developmentTime) {
        this.developmentTime = developmentTime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
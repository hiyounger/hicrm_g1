package com.newroad.system.manage.entity;

import java.util.Date;

public class ProductImages {
    private Long id;

    private Long productId;

    private Short isMain;

    private String name;

    private String saveName;

    private String imgSize;

    private String path;

    private Date createTime;

    private Long sortnum;

    public ProductImages(Long id, Long productId, Short isMain, String name, String saveName, String imgSize, String path, Date createTime, Long sortnum) {
        this.id = id;
        this.productId = productId;
        this.isMain = isMain;
        this.name = name;
        this.saveName = saveName;
        this.imgSize = imgSize;
        this.path = path;
        this.createTime = createTime;
        this.sortnum = sortnum;
    }

    public ProductImages() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Short getIsMain() {
        return isMain;
    }

    public void setIsMain(Short isMain) {
        this.isMain = isMain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName == null ? null : saveName.trim();
    }

    public String getImgSize() {
        return imgSize;
    }

    public void setImgSize(String imgSize) {
        this.imgSize = imgSize == null ? null : imgSize.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getSortnum() {
        return sortnum;
    }

    public void setSortnum(Long sortnum) {
        this.sortnum = sortnum;
    }
}
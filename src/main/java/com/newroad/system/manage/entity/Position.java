package com.newroad.system.manage.entity;

public class Position {
    private Long id;

    private Long parentId;

    private String name;

    private Long departmentId;

    private String description;

    public Position(Long id, Long parentId, String name, Long departmentId, String description) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.departmentId = departmentId;
        this.description = description;
    }

    public Position() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
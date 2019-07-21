package com.newroad.system.role.entity;

import java.util.Date;

public class Role {
    private Long id;

    private Date createtime;

    private String rolename;

    private String rolenote;

    private Long sortnum;

    private Long status;

    private Date updatetime;

    private Long createby;

    private Long updateby;

    public Role(Long id, Date createtime, String rolename, String rolenote, Long sortnum, Long status, Date updatetime, Long createby, Long updateby) {
        this.id = id;
        this.createtime = createtime;
        this.rolename = rolename;
        this.rolenote = rolenote;
        this.sortnum = sortnum;
        this.status = status;
        this.updatetime = updatetime;
        this.createby = createby;
        this.updateby = updateby;
    }

    public Role() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolenote() {
        return rolenote;
    }

    public void setRolenote(String rolenote) {
        this.rolenote = rolenote == null ? null : rolenote.trim();
    }

    public Long getSortnum() {
        return sortnum;
    }

    public void setSortnum(Long sortnum) {
        this.sortnum = sortnum;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getCreateby() {
        return createby;
    }

    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    public Long getUpdateby() {
        return updateby;
    }

    public void setUpdateby(Long updateby) {
        this.updateby = updateby;
    }
}
package com.newroad.system.manage.entity;

import java.util.Date;

public class Function {
    private Long id;

    private String funccode;

    private String funcname;

    private String funcnote;

    private Long functype;

    private String funcurl;

    private String iconclass;

    private String iconurl;

    private Long parentid;

    private Long createby;

    private Long updateby;

    private Long sortnum;

    private Date updatetime;

    private Date createtime;

    private Long status;

    public Function(Long id, String funccode, String funcname, String funcnote, Long functype, String funcurl, String iconclass, String iconurl, Long parentid, Long createby, Long updateby, Long sortnum, Date updatetime, Date createtime, Long status) {
        this.id = id;
        this.funccode = funccode;
        this.funcname = funcname;
        this.funcnote = funcnote;
        this.functype = functype;
        this.funcurl = funcurl;
        this.iconclass = iconclass;
        this.iconurl = iconurl;
        this.parentid = parentid;
        this.createby = createby;
        this.updateby = updateby;
        this.sortnum = sortnum;
        this.updatetime = updatetime;
        this.createtime = createtime;
        this.status = status;
    }

    public Function() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFunccode() {
        return funccode;
    }

    public void setFunccode(String funccode) {
        this.funccode = funccode == null ? null : funccode.trim();
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname == null ? null : funcname.trim();
    }

    public String getFuncnote() {
        return funcnote;
    }

    public void setFuncnote(String funcnote) {
        this.funcnote = funcnote == null ? null : funcnote.trim();
    }

    public Long getFunctype() {
        return functype;
    }

    public void setFunctype(Long functype) {
        this.functype = functype;
    }

    public String getFuncurl() {
        return funcurl;
    }

    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl == null ? null : funcurl.trim();
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass == null ? null : iconclass.trim();
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl == null ? null : iconurl.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
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

    public Long getSortnum() {
        return sortnum;
    }

    public void setSortnum(Long sortnum) {
        this.sortnum = sortnum;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
package com.newroad.manage.sale.entity;

public class EmailTemplate {
    private Long id;

    private String subject;

    private String title;

    private String content;

    private Long orderId;

    public EmailTemplate(Long id, String subject, String title, String content, Long orderId) {
        this.id = id;
        this.subject = subject;
        this.title = title;
        this.content = content;
        this.orderId = orderId;
    }

    public EmailTemplate() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
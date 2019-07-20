package com.newroad.manage.announcement.dao;

import com.newroad.system.manage.entity.EmailTemplate;

public interface EmailTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmailTemplate record);

    int insertSelective(EmailTemplate record);

    EmailTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmailTemplate record);

    int updateByPrimaryKey(EmailTemplate record);
}
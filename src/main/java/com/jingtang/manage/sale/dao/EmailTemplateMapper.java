package com.jingtang.manage.sale.dao;

import com.jingtang.manage.sale.entity.EmailTemplate;

public interface EmailTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmailTemplate record);

    int insertSelective(EmailTemplate record);

    EmailTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmailTemplate record);

    int updateByPrimaryKey(EmailTemplate record);
}
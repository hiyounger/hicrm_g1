package com.newroad.manage.announcement.dao;

import com.newroad.system.manage.entity.EmailRecord;

public interface EmailRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmailRecord record);

    int insertSelective(EmailRecord record);

    EmailRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmailRecord record);

    int updateByPrimaryKey(EmailRecord record);
}
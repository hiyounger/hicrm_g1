package com.newroad.manage.announcement.dao;

import com.newroad.system.manage.entity.Contacts;

public interface ContactsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Contacts record);

    int insertSelective(Contacts record);

    Contacts selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Contacts record);

    int updateByPrimaryKey(Contacts record);
}
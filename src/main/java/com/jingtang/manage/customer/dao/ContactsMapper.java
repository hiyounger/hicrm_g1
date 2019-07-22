package com.jingtang.manage.customer.dao;

import com.jingtang.manage.customer.entity.Contacts;

public interface ContactsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Contacts record);

    int insertSelective(Contacts record);

    Contacts selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Contacts record);

    int updateByPrimaryKey(Contacts record);
}
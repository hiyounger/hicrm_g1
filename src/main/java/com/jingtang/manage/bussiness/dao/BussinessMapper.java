package com.jingtang.manage.bussiness.dao;

import com.jingtang.manage.bussiness.entity.Bussiness;

public interface BussinessMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bussiness record);

    int insertSelective(Bussiness record);

    Bussiness selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bussiness record);

    int updateByPrimaryKey(Bussiness record);
}
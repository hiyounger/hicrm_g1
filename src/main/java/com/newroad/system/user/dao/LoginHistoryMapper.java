package com.newroad.system.user.dao;

import com.newroad.system.manage.entity.LoginHistory;

public interface LoginHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginHistory record);

    int insertSelective(LoginHistory record);

    LoginHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginHistory record);

    int updateByPrimaryKey(LoginHistory record);
}
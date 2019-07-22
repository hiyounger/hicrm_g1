package com.jingtang.system.login_loginfo.dao;

import com.jingtang.system.login_loginfo.entity.LoginHistory;

public interface LoginHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginHistory record);

    int insertSelective(LoginHistory record);

    LoginHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginHistory record);

    int updateByPrimaryKey(LoginHistory record);
}
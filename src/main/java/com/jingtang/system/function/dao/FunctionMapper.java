package com.jingtang.system.function.dao;

import com.jingtang.system.function.entity.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}
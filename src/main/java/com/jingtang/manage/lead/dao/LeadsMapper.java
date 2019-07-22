package com.jingtang.manage.lead.dao;

import com.jingtang.manage.lead.entity.Leads;

public interface LeadsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Leads record);

    int insertSelective(Leads record);

    Leads selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Leads record);

    int updateByPrimaryKey(Leads record);
}
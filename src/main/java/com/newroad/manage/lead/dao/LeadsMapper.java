package com.newroad.manage.lead.dao;

import com.newroad.manage.lead.entity.Leads;

public interface LeadsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Leads record);

    int insertSelective(Leads record);

    Leads selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Leads record);

    int updateByPrimaryKey(Leads record);
}
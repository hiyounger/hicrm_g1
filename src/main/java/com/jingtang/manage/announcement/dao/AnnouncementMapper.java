package com.jingtang.manage.announcement.dao;

import com.jingtang.manage.announcement.entity.Announcement;

public interface AnnouncementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    Announcement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
}
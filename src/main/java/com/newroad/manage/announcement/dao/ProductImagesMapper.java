package com.newroad.manage.announcement.dao;

import com.newroad.system.manage.entity.ProductImages;

public interface ProductImagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    ProductImages selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}
package com.jingtang.manage.product.dao;

import com.jingtang.manage.product.entity.ProductImages;

public interface ProductImagesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    ProductImages selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}
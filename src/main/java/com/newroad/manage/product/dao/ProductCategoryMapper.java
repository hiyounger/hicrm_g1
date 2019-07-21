package com.newroad.manage.product.dao;

import com.newroad.manage.product.entity.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}
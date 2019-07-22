package com.jingtang.manage.product.dao;

import com.jingtang.manage.product.entity.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}
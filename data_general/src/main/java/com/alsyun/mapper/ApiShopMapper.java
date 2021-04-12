package com.alsyun.mapper;

import com.alsyun.model.ApiShop;
import com.alsyun.model.ApiShopExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApiShopMapper {
    long countByExample(ApiShopExample example);

    int deleteByExample(ApiShopExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiShop record);

    int insertSelective(ApiShop record);

    List<ApiShop> selectByExample(ApiShopExample example);

    ApiShop selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiShop record, @Param("example") ApiShopExample example);

    int updateByExample(@Param("record") ApiShop record, @Param("example") ApiShopExample example);

    int updateByPrimaryKeySelective(ApiShop record);

    int updateByPrimaryKey(ApiShop record);
}
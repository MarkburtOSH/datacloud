package com.alsyun.mapper;

import com.alsyun.model.ImsBaseStoreHotel;
import com.alsyun.model.ImsBaseStoreHotelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsBaseStoreHotelMapper {
    long countByExample(ImsBaseStoreHotelExample example);

    int deleteByExample(ImsBaseStoreHotelExample example);

    int insert(ImsBaseStoreHotel record);

    int insertSelective(ImsBaseStoreHotel record);

    List<ImsBaseStoreHotel> selectByExample(ImsBaseStoreHotelExample example);

    int updateByExampleSelective(@Param("record") ImsBaseStoreHotel record, @Param("example") ImsBaseStoreHotelExample example);

    int updateByExample(@Param("record") ImsBaseStoreHotel record, @Param("example") ImsBaseStoreHotelExample example);
}
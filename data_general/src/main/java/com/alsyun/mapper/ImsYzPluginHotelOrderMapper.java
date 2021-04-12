package com.alsyun.mapper;

import com.alsyun.model.ImsYzPluginHotelOrder;
import com.alsyun.model.ImsYzPluginHotelOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzPluginHotelOrderMapper {
    long countByExample(ImsYzPluginHotelOrderExample example);

    int deleteByExample(ImsYzPluginHotelOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImsYzPluginHotelOrder record);

    int insertSelective(ImsYzPluginHotelOrder record);

    List<ImsYzPluginHotelOrder> selectByExample(ImsYzPluginHotelOrderExample example);

    ImsYzPluginHotelOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImsYzPluginHotelOrder record, @Param("example") ImsYzPluginHotelOrderExample example);

    int updateByExample(@Param("record") ImsYzPluginHotelOrder record, @Param("example") ImsYzPluginHotelOrderExample example);

    int updateByPrimaryKeySelective(ImsYzPluginHotelOrder record);

    int updateByPrimaryKey(ImsYzPluginHotelOrder record);
}
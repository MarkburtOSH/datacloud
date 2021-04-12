package com.alsyun.mapper;

import com.alsyun.model.ImsYzPluginStoreOrder;
import com.alsyun.model.ImsYzPluginStoreOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzPluginStoreOrderMapper {
    long countByExample(ImsYzPluginStoreOrderExample example);

    int deleteByExample(ImsYzPluginStoreOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImsYzPluginStoreOrder record);

    int insertSelective(ImsYzPluginStoreOrder record);

    List<ImsYzPluginStoreOrder> selectByExample(ImsYzPluginStoreOrderExample example);

    ImsYzPluginStoreOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImsYzPluginStoreOrder record, @Param("example") ImsYzPluginStoreOrderExample example);

    int updateByExample(@Param("record") ImsYzPluginStoreOrder record, @Param("example") ImsYzPluginStoreOrderExample example);

    int updateByPrimaryKeySelective(ImsYzPluginStoreOrder record);

    int updateByPrimaryKey(ImsYzPluginStoreOrder record);
}
package com.alsyun.mapper;

import com.alsyun.model.ImsYzOrderGoods;
import com.alsyun.model.ImsYzOrderGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzOrderGoodsMapper {
    long countByExample(ImsYzOrderGoodsExample example);

    int deleteByExample(ImsYzOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImsYzOrderGoods record);

    int insertSelective(ImsYzOrderGoods record);

    List<ImsYzOrderGoods> selectByExample(ImsYzOrderGoodsExample example);

    ImsYzOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImsYzOrderGoods record, @Param("example") ImsYzOrderGoodsExample example);

    int updateByExample(@Param("record") ImsYzOrderGoods record, @Param("example") ImsYzOrderGoodsExample example);

    int updateByPrimaryKeySelective(ImsYzOrderGoods record);

    int updateByPrimaryKey(ImsYzOrderGoods record);
}
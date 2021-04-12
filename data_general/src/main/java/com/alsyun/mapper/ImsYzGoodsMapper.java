package com.alsyun.mapper;

import com.alsyun.model.ImsYzGoods;
import com.alsyun.model.ImsYzGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzGoodsMapper {
    long countByExample(ImsYzGoodsExample example);

    int deleteByExample(ImsYzGoodsExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("isDeleted") Byte isDeleted);

    int insert(ImsYzGoods record);

    int insertSelective(ImsYzGoods record);

    List<ImsYzGoods> selectByExampleWithBLOBs(ImsYzGoodsExample example);

    List<ImsYzGoods> selectByExample(ImsYzGoodsExample example);

    ImsYzGoods selectByPrimaryKey(@Param("id") Integer id, @Param("isDeleted") Byte isDeleted);

    int updateByExampleSelective(@Param("record") ImsYzGoods record, @Param("example") ImsYzGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") ImsYzGoods record, @Param("example") ImsYzGoodsExample example);

    int updateByExample(@Param("record") ImsYzGoods record, @Param("example") ImsYzGoodsExample example);

    int updateByPrimaryKeySelective(ImsYzGoods record);

    int updateByPrimaryKeyWithBLOBs(ImsYzGoods record);

    int updateByPrimaryKey(ImsYzGoods record);
}
package com.alsyun.mapper;

import com.alsyun.model.ImsYzOrder;
import com.alsyun.model.ImsYzOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzOrderMapper {
    long countByExample(ImsYzOrderExample example);

    int deleteByExample(ImsYzOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImsYzOrder record);

    int insertSelective(ImsYzOrder record);

    List<ImsYzOrder> selectByExampleWithBLOBs(ImsYzOrderExample example);

    List<ImsYzOrder> selectByExample(ImsYzOrderExample example);

    ImsYzOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImsYzOrder record, @Param("example") ImsYzOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") ImsYzOrder record, @Param("example") ImsYzOrderExample example);

    int updateByExample(@Param("record") ImsYzOrder record, @Param("example") ImsYzOrderExample example);

    int updateByPrimaryKeySelective(ImsYzOrder record);

    int updateByPrimaryKeyWithBLOBs(ImsYzOrder record);

    int updateByPrimaryKey(ImsYzOrder record);
}
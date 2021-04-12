package com.alsyun.mapper;

import com.alsyun.model.DstCashInOut;
import com.alsyun.model.DstCashInOutExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstCashInOutMapper {
    long countByExample(DstCashInOutExample example);

    int deleteByExample(DstCashInOutExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("oddNumbers") String oddNumbers);

    int insert(DstCashInOut record);

    int insertSelective(DstCashInOut record);

    List<DstCashInOut> selectByExample(DstCashInOutExample example);

    DstCashInOut selectByPrimaryKey(@Param("id") Integer id, @Param("oddNumbers") String oddNumbers);

    int updateByExampleSelective(@Param("record") DstCashInOut record, @Param("example") DstCashInOutExample example);

    int updateByExample(@Param("record") DstCashInOut record, @Param("example") DstCashInOutExample example);

    int updateByPrimaryKeySelective(DstCashInOut record);

    int updateByPrimaryKey(DstCashInOut record);
}
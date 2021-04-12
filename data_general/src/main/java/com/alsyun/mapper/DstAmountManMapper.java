package com.alsyun.mapper;

import com.alsyun.model.DstAmountMan;
import com.alsyun.model.DstAmountManExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstAmountManMapper {
    long countByExample(DstAmountManExample example);

    int deleteByExample(DstAmountManExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstAmountMan record);

    int insertSelective(DstAmountMan record);

    List<DstAmountMan> selectByExample(DstAmountManExample example);

    DstAmountMan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstAmountMan record, @Param("example") DstAmountManExample example);

    int updateByExample(@Param("record") DstAmountMan record, @Param("example") DstAmountManExample example);

    int updateByPrimaryKeySelective(DstAmountMan record);

    int updateByPrimaryKey(DstAmountMan record);
}
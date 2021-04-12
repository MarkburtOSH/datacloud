package com.alsyun.mapper;

import com.alsyun.model.DstMoneySupervise;
import com.alsyun.model.DstMoneySuperviseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstMoneySuperviseMapper {
    long countByExample(DstMoneySuperviseExample example);

    int deleteByExample(DstMoneySuperviseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstMoneySupervise record);

    int insertSelective(DstMoneySupervise record);

    List<DstMoneySupervise> selectByExample(DstMoneySuperviseExample example);

    DstMoneySupervise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstMoneySupervise record, @Param("example") DstMoneySuperviseExample example);

    int updateByExample(@Param("record") DstMoneySupervise record, @Param("example") DstMoneySuperviseExample example);

    int updateByPrimaryKeySelective(DstMoneySupervise record);

    int updateByPrimaryKey(DstMoneySupervise record);
}
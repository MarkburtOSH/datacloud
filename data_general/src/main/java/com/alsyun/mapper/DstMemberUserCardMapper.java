package com.alsyun.mapper;

import com.alsyun.model.DstMemberUserCard;
import com.alsyun.model.DstMemberUserCardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstMemberUserCardMapper {
    long countByExample(DstMemberUserCardExample example);

    int deleteByExample(DstMemberUserCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstMemberUserCard record);

    int insertSelective(DstMemberUserCard record);

    List<DstMemberUserCard> selectByExample(DstMemberUserCardExample example);

    DstMemberUserCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstMemberUserCard record, @Param("example") DstMemberUserCardExample example);

    int updateByExample(@Param("record") DstMemberUserCard record, @Param("example") DstMemberUserCardExample example);

    int updateByPrimaryKeySelective(DstMemberUserCard record);

    int updateByPrimaryKey(DstMemberUserCard record);
}
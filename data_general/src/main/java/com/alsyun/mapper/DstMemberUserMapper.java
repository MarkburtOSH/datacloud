package com.alsyun.mapper;

import com.alsyun.model.DstMemberUser;
import com.alsyun.model.DstMemberUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstMemberUserMapper {
    long countByExample(DstMemberUserExample example);

    int deleteByExample(DstMemberUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstMemberUser record);

    int insertSelective(DstMemberUser record);

    List<DstMemberUser> selectByExample(DstMemberUserExample example);

    DstMemberUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstMemberUser record, @Param("example") DstMemberUserExample example);

    int updateByExample(@Param("record") DstMemberUser record, @Param("example") DstMemberUserExample example);

    int updateByPrimaryKeySelective(DstMemberUser record);

    int updateByPrimaryKey(DstMemberUser record);
}
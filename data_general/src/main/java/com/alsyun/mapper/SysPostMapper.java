package com.alsyun.mapper;

import com.alsyun.model.SysPost;
import com.alsyun.model.SysPostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPostMapper {
    long countByExample(SysPostExample example);

    int deleteByExample(SysPostExample example);

    int deleteByPrimaryKey(Long postId);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    List<SysPost> selectByExample(SysPostExample example);

    SysPost selectByPrimaryKey(Long postId);

    int updateByExampleSelective(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByExample(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);
}
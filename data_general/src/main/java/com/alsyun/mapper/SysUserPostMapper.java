package com.alsyun.mapper;

import com.alsyun.model.SysUserPost;
import com.alsyun.model.SysUserPostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserPostMapper {
    long countByExample(SysUserPostExample example);

    int deleteByExample(SysUserPostExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("postId") Long postId);

    int insert(SysUserPost record);

    int insertSelective(SysUserPost record);

    List<SysUserPost> selectByExample(SysUserPostExample example);

    int updateByExampleSelective(@Param("record") SysUserPost record, @Param("example") SysUserPostExample example);

    int updateByExample(@Param("record") SysUserPost record, @Param("example") SysUserPostExample example);
}
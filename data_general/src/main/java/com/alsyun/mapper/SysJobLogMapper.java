package com.alsyun.mapper;

import com.alsyun.model.SysJobLog;
import com.alsyun.model.SysJobLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysJobLogMapper {
    long countByExample(SysJobLogExample example);

    int deleteByExample(SysJobLogExample example);

    int deleteByPrimaryKey(Long jobLogId);

    int insert(SysJobLog record);

    int insertSelective(SysJobLog record);

    List<SysJobLog> selectByExample(SysJobLogExample example);

    SysJobLog selectByPrimaryKey(Long jobLogId);

    int updateByExampleSelective(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByExample(@Param("record") SysJobLog record, @Param("example") SysJobLogExample example);

    int updateByPrimaryKeySelective(SysJobLog record);

    int updateByPrimaryKey(SysJobLog record);
}
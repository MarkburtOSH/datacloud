package com.alsyun.mapper;

import com.alsyun.model.SysJob;
import com.alsyun.model.SysJobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysJobMapper {
    long countByExample(SysJobExample example);

    int deleteByExample(SysJobExample example);

    int deleteByPrimaryKey(@Param("jobId") Long jobId, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    List<SysJob> selectByExample(SysJobExample example);

    SysJob selectByPrimaryKey(@Param("jobId") Long jobId, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    int updateByExampleSelective(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByExample(@Param("record") SysJob record, @Param("example") SysJobExample example);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}
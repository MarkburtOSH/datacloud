package com.alsyun.mapper;

import com.alsyun.model.QrtzSchedulerState;
import com.alsyun.model.QrtzSchedulerStateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QrtzSchedulerStateMapper {
    long countByExample(QrtzSchedulerStateExample example);

    int deleteByExample(QrtzSchedulerStateExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int insert(QrtzSchedulerState record);

    int insertSelective(QrtzSchedulerState record);

    List<QrtzSchedulerState> selectByExample(QrtzSchedulerStateExample example);

    QrtzSchedulerState selectByPrimaryKey(@Param("schedName") String schedName, @Param("instanceName") String instanceName);

    int updateByExampleSelective(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    int updateByExample(@Param("record") QrtzSchedulerState record, @Param("example") QrtzSchedulerStateExample example);

    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    int updateByPrimaryKey(QrtzSchedulerState record);
}
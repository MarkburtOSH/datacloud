package com.alsyun.mapper;

import com.alsyun.model.QrtzTriggers;
import com.alsyun.model.QrtzTriggersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QrtzTriggersMapper {
    long countByExample(QrtzTriggersExample example);

    int deleteByExample(QrtzTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    List<QrtzTriggers> selectByExampleWithBLOBs(QrtzTriggersExample example);

    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    QrtzTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}
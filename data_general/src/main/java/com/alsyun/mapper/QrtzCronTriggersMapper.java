package com.alsyun.mapper;

import com.alsyun.model.QrtzCronTriggers;
import com.alsyun.model.QrtzCronTriggersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QrtzCronTriggersMapper {
    long countByExample(QrtzCronTriggersExample example);

    int deleteByExample(QrtzCronTriggersExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    List<QrtzCronTriggers> selectByExample(QrtzCronTriggersExample example);

    QrtzCronTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    int updateByExampleSelective(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByExample(@Param("record") QrtzCronTriggers record, @Param("example") QrtzCronTriggersExample example);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}
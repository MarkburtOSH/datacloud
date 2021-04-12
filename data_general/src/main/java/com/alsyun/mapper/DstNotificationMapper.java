package com.alsyun.mapper;

import com.alsyun.model.DstNotification;
import com.alsyun.model.DstNotificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstNotificationMapper {
    long countByExample(DstNotificationExample example);

    int deleteByExample(DstNotificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstNotification record);

    int insertSelective(DstNotification record);

    List<DstNotification> selectByExample(DstNotificationExample example);

    DstNotification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstNotification record, @Param("example") DstNotificationExample example);

    int updateByExample(@Param("record") DstNotification record, @Param("example") DstNotificationExample example);

    int updateByPrimaryKeySelective(DstNotification record);

    int updateByPrimaryKey(DstNotification record);
}
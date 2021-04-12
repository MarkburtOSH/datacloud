package com.alsyun.mapper;

import com.alsyun.model.QrtzLocks;
import com.alsyun.model.QrtzLocksExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QrtzLocksMapper {
    long countByExample(QrtzLocksExample example);

    int deleteByExample(QrtzLocksExample example);

    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("lockName") String lockName);

    int insert(QrtzLocks record);

    int insertSelective(QrtzLocks record);

    List<QrtzLocks> selectByExample(QrtzLocksExample example);

    int updateByExampleSelective(@Param("record") QrtzLocks record, @Param("example") QrtzLocksExample example);

    int updateByExample(@Param("record") QrtzLocks record, @Param("example") QrtzLocksExample example);
}
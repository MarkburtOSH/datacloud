package com.alsyun.mapper;

import com.alsyun.model.DstReconciliation;
import com.alsyun.model.DstReconciliationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstReconciliationMapper {
    long countByExample(DstReconciliationExample example);

    int deleteByExample(DstReconciliationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstReconciliation record);

    int insertSelective(DstReconciliation record);

    List<DstReconciliation> selectByExample(DstReconciliationExample example);

    DstReconciliation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstReconciliation record, @Param("example") DstReconciliationExample example);

    int updateByExample(@Param("record") DstReconciliation record, @Param("example") DstReconciliationExample example);

    int updateByPrimaryKeySelective(DstReconciliation record);

    int updateByPrimaryKey(DstReconciliation record);
}
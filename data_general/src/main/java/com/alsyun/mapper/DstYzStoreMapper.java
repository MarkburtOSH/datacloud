package com.alsyun.mapper;

import com.alsyun.model.DstYzStore;
import com.alsyun.model.DstYzStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstYzStoreMapper {
    long countByExample(DstYzStoreExample example);

    int deleteByExample(DstYzStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstYzStore record);

    int insertSelective(DstYzStore record);

    List<DstYzStore> selectByExampleWithBLOBs(DstYzStoreExample example);

    List<DstYzStore> selectByExample(DstYzStoreExample example);

    DstYzStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstYzStore record, @Param("example") DstYzStoreExample example);

    int updateByExampleWithBLOBs(@Param("record") DstYzStore record, @Param("example") DstYzStoreExample example);

    int updateByExample(@Param("record") DstYzStore record, @Param("example") DstYzStoreExample example);

    int updateByPrimaryKeySelective(DstYzStore record);

    int updateByPrimaryKeyWithBLOBs(DstYzStore record);

    int updateByPrimaryKey(DstYzStore record);
}
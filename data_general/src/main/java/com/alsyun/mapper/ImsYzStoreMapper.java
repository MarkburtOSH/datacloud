package com.alsyun.mapper;

import com.alsyun.model.ImsYzStore;
import com.alsyun.model.ImsYzStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzStoreMapper {
    long countByExample(ImsYzStoreExample example);

    int deleteByExample(ImsYzStoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImsYzStore record);

    int insertSelective(ImsYzStore record);

    List<ImsYzStore> selectByExampleWithBLOBs(ImsYzStoreExample example);

    List<ImsYzStore> selectByExample(ImsYzStoreExample example);

    ImsYzStore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImsYzStore record, @Param("example") ImsYzStoreExample example);

    int updateByExampleWithBLOBs(@Param("record") ImsYzStore record, @Param("example") ImsYzStoreExample example);

    int updateByExample(@Param("record") ImsYzStore record, @Param("example") ImsYzStoreExample example);

    int updateByPrimaryKeySelective(ImsYzStore record);

    int updateByPrimaryKeyWithBLOBs(ImsYzStore record);

    int updateByPrimaryKey(ImsYzStore record);
}
package com.alsyun.mapper;

import com.alsyun.model.DstAccount;
import com.alsyun.model.DstAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstAccountMapper {
    long countByExample(DstAccountExample example);

    int deleteByExample(DstAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstAccount record);

    int insertSelective(DstAccount record);

    List<DstAccount> selectByExample(DstAccountExample example);

    DstAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstAccount record, @Param("example") DstAccountExample example);

    int updateByExample(@Param("record") DstAccount record, @Param("example") DstAccountExample example);

    int updateByPrimaryKeySelective(DstAccount record);

    int updateByPrimaryKey(DstAccount record);
}
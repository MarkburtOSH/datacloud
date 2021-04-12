package com.alsyun.mapper;

import com.alsyun.model.DstShContractAdminister;
import com.alsyun.model.DstShContractAdministerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstShContractAdministerMapper {
    long countByExample(DstShContractAdministerExample example);

    int deleteByExample(DstShContractAdministerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstShContractAdminister record);

    int insertSelective(DstShContractAdminister record);

    List<DstShContractAdminister> selectByExample(DstShContractAdministerExample example);

    DstShContractAdminister selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstShContractAdminister record, @Param("example") DstShContractAdministerExample example);

    int updateByExample(@Param("record") DstShContractAdminister record, @Param("example") DstShContractAdministerExample example);

    int updateByPrimaryKeySelective(DstShContractAdminister record);

    int updateByPrimaryKey(DstShContractAdminister record);
}
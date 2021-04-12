package com.alsyun.mapper;

import com.alsyun.model.GenTableColumn;
import com.alsyun.model.GenTableColumnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GenTableColumnMapper {
    long countByExample(GenTableColumnExample example);

    int deleteByExample(GenTableColumnExample example);

    int deleteByPrimaryKey(Long columnId);

    int insert(GenTableColumn record);

    int insertSelective(GenTableColumn record);

    List<GenTableColumn> selectByExample(GenTableColumnExample example);

    GenTableColumn selectByPrimaryKey(Long columnId);

    int updateByExampleSelective(@Param("record") GenTableColumn record, @Param("example") GenTableColumnExample example);

    int updateByExample(@Param("record") GenTableColumn record, @Param("example") GenTableColumnExample example);

    int updateByPrimaryKeySelective(GenTableColumn record);

    int updateByPrimaryKey(GenTableColumn record);
}
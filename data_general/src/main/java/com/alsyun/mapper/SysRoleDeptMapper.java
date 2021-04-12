package com.alsyun.mapper;

import com.alsyun.model.SysRoleDept;
import com.alsyun.model.SysRoleDeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleDeptMapper {
    long countByExample(SysRoleDeptExample example);

    int deleteByExample(SysRoleDeptExample example);

    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("deptId") Long deptId);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    List<SysRoleDept> selectByExample(SysRoleDeptExample example);

    int updateByExampleSelective(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);

    int updateByExample(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);
}
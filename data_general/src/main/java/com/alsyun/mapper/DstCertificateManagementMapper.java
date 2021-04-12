package com.alsyun.mapper;

import com.alsyun.model.DstCertificateManagement;
import com.alsyun.model.DstCertificateManagementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DstCertificateManagementMapper {
    long countByExample(DstCertificateManagementExample example);

    int deleteByExample(DstCertificateManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DstCertificateManagement record);

    int insertSelective(DstCertificateManagement record);

    List<DstCertificateManagement> selectByExample(DstCertificateManagementExample example);

    DstCertificateManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DstCertificateManagement record, @Param("example") DstCertificateManagementExample example);

    int updateByExample(@Param("record") DstCertificateManagement record, @Param("example") DstCertificateManagementExample example);

    int updateByPrimaryKeySelective(DstCertificateManagement record);

    int updateByPrimaryKey(DstCertificateManagement record);
}
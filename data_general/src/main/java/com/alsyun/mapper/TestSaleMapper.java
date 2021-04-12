package com.alsyun.mapper;

import com.alsyun.model.TestSale;
import com.alsyun.model.TestSaleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestSaleMapper {
    long countByExample(TestSaleExample example);

    int deleteByExample(TestSaleExample example);

    int deleteByPrimaryKey(String id);

    int insert(TestSale record);

    int insertSelective(TestSale record);

    List<TestSale> selectByExample(TestSaleExample example);

    TestSale selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TestSale record, @Param("example") TestSaleExample example);

    int updateByExample(@Param("record") TestSale record, @Param("example") TestSaleExample example);

    int updateByPrimaryKeySelective(TestSale record);

    int updateByPrimaryKey(TestSale record);
}
package com.alsyun.mapper;

import com.alsyun.model.ImsYzGoodsCopy;
import com.alsyun.model.ImsYzGoodsCopyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImsYzGoodsCopyMapper {
    long countByExample(ImsYzGoodsCopyExample example);

    int deleteByExample(ImsYzGoodsCopyExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("isDeleted") Byte isDeleted);

    int insert(ImsYzGoodsCopy record);

    int insertSelective(ImsYzGoodsCopy record);

    List<ImsYzGoodsCopy> selectByExampleWithBLOBs(ImsYzGoodsCopyExample example);

    List<ImsYzGoodsCopy> selectByExample(ImsYzGoodsCopyExample example);

    ImsYzGoodsCopy selectByPrimaryKey(@Param("id") Integer id, @Param("isDeleted") Byte isDeleted);

    int updateByExampleSelective(@Param("record") ImsYzGoodsCopy record, @Param("example") ImsYzGoodsCopyExample example);

    int updateByExampleWithBLOBs(@Param("record") ImsYzGoodsCopy record, @Param("example") ImsYzGoodsCopyExample example);

    int updateByExample(@Param("record") ImsYzGoodsCopy record, @Param("example") ImsYzGoodsCopyExample example);

    int updateByPrimaryKeySelective(ImsYzGoodsCopy record);

    int updateByPrimaryKeyWithBLOBs(ImsYzGoodsCopy record);

    int updateByPrimaryKey(ImsYzGoodsCopy record);
}
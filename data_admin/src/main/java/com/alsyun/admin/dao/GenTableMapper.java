package com.alsyun.admin.dao;
import com.alsyun.admin.pojo.GenTable;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/****
 * @Author:Markburt
 * @Description:GenTable的Dao
 * @Date 2019/6/14 0:12
 *****/

@Repository
public interface GenTableMapper extends Mapper<GenTable> {
}

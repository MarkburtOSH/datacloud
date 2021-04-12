package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.GenTableColumnMapper;
import com.alsyun.admin.pojo.GenTableColumn;
import com.alsyun.admin.service.GenTableColumnService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:GenTableColumn业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class GenTableColumnServiceImpl implements GenTableColumnService {

    @Autowired
    private GenTableColumnMapper genTableColumnMapper;


    /**
     * GenTableColumn条件+分页查询
     * @param genTableColumn 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<GenTableColumn> findPage(GenTableColumn genTableColumn, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(genTableColumn);
        //执行搜索
        return new PageInfo<GenTableColumn>(genTableColumnMapper.selectByExample(example));
    }

    /**
     * GenTableColumn分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<GenTableColumn> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<GenTableColumn>(genTableColumnMapper.selectAll());
    }

    /**
     * GenTableColumn条件查询
     * @param genTableColumn
     * @return
     */
    @Override
    public List<GenTableColumn> findList(GenTableColumn genTableColumn){
        //构建查询条件
        Example example = createExample(genTableColumn);
        //根据构建的条件查询数据
        return genTableColumnMapper.selectByExample(example);
    }


    /**
     * GenTableColumn构建查询对象
     * @param genTableColumn
     * @return
     */
    public Example createExample(GenTableColumn genTableColumn){
        Example example=new Example(GenTableColumn.class);
        Example.Criteria criteria = example.createCriteria();
        if(genTableColumn!=null){
            // 编号
            if(!StringUtils.isEmpty(genTableColumn.getColumnId())){
                    criteria.andEqualTo("columnId",genTableColumn.getColumnId());
            }
            // 归属表编号
            if(!StringUtils.isEmpty(genTableColumn.getTableId())){
                    criteria.andEqualTo("tableId",genTableColumn.getTableId());
            }
            // 列名称
            if(!StringUtils.isEmpty(genTableColumn.getColumnName())){
                    criteria.andEqualTo("columnName",genTableColumn.getColumnName());
            }
            // 列描述
            if(!StringUtils.isEmpty(genTableColumn.getColumnComment())){
                    criteria.andEqualTo("columnComment",genTableColumn.getColumnComment());
            }
            // 列类型
            if(!StringUtils.isEmpty(genTableColumn.getColumnType())){
                    criteria.andEqualTo("columnType",genTableColumn.getColumnType());
            }
            // JAVA类型
            if(!StringUtils.isEmpty(genTableColumn.getJavaType())){
                    criteria.andEqualTo("javaType",genTableColumn.getJavaType());
            }
            // JAVA字段名
            if(!StringUtils.isEmpty(genTableColumn.getJavaField())){
                    criteria.andEqualTo("javaField",genTableColumn.getJavaField());
            }
            // 是否主键（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsPk())){
                    criteria.andEqualTo("isPk",genTableColumn.getIsPk());
            }
            // 是否自增（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsIncrement())){
                    criteria.andEqualTo("isIncrement",genTableColumn.getIsIncrement());
            }
            // 是否必填（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsRequired())){
                    criteria.andEqualTo("isRequired",genTableColumn.getIsRequired());
            }
            // 是否为插入字段（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsInsert())){
                    criteria.andEqualTo("isInsert",genTableColumn.getIsInsert());
            }
            // 是否编辑字段（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsEdit())){
                    criteria.andEqualTo("isEdit",genTableColumn.getIsEdit());
            }
            // 是否列表字段（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsList())){
                    criteria.andEqualTo("isList",genTableColumn.getIsList());
            }
            // 是否查询字段（1是）
            if(!StringUtils.isEmpty(genTableColumn.getIsQuery())){
                    criteria.andEqualTo("isQuery",genTableColumn.getIsQuery());
            }
            // 查询方式（等于、不等于、大于、小于、范围）
            if(!StringUtils.isEmpty(genTableColumn.getQueryType())){
                    criteria.andEqualTo("queryType",genTableColumn.getQueryType());
            }
            // 显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）
            if(!StringUtils.isEmpty(genTableColumn.getHtmlType())){
                    criteria.andEqualTo("htmlType",genTableColumn.getHtmlType());
            }
            // 字典类型
            if(!StringUtils.isEmpty(genTableColumn.getDictType())){
                    criteria.andEqualTo("dictType",genTableColumn.getDictType());
            }
            // 排序
            if(!StringUtils.isEmpty(genTableColumn.getSort())){
                    criteria.andEqualTo("sort",genTableColumn.getSort());
            }
            // 创建者
            if(!StringUtils.isEmpty(genTableColumn.getCreateBy())){
                    criteria.andEqualTo("createBy",genTableColumn.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(genTableColumn.getCreateTime())){
                    criteria.andEqualTo("createTime",genTableColumn.getCreateTime());
            }
            // 更新者
            if(!StringUtils.isEmpty(genTableColumn.getUpdateBy())){
                    criteria.andEqualTo("updateBy",genTableColumn.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(genTableColumn.getUpdateTime())){
                    criteria.andEqualTo("updateTime",genTableColumn.getUpdateTime());
            }
        }
        return example;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id){
        genTableColumnMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改GenTableColumn
     * @param genTableColumn
     */
    @Override
    public void update(GenTableColumn genTableColumn){
        genTableColumnMapper.updateByPrimaryKey(genTableColumn);
    }

    /**
     * 增加GenTableColumn
     * @param genTableColumn
     */
    @Override
    public void add(GenTableColumn genTableColumn){
        genTableColumnMapper.insert(genTableColumn);
    }

    /**
     * 根据ID查询GenTableColumn
     * @param id
     * @return
     */
    @Override
    public GenTableColumn findById(Long id){
        return  genTableColumnMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询GenTableColumn全部数据
     * @return
     */
    @Override
    public List<GenTableColumn> findAll() {
        return genTableColumnMapper.selectAll();
    }
}

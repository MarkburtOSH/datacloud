package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.GenTableMapper;
import com.alsyun.admin.pojo.GenTable;
import com.alsyun.admin.service.GenTableService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:GenTable业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class GenTableServiceImpl implements GenTableService {

    @Autowired
    private GenTableMapper genTableMapper;


    /**
     * GenTable条件+分页查询
     * @param genTable 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<GenTable> findPage(GenTable genTable, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(genTable);
        //执行搜索
        return new PageInfo<GenTable>(genTableMapper.selectByExample(example));
    }

    /**
     * GenTable分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<GenTable> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<GenTable>(genTableMapper.selectAll());
    }

    /**
     * GenTable条件查询
     * @param genTable
     * @return
     */
    @Override
    public List<GenTable> findList(GenTable genTable){
        //构建查询条件
        Example example = createExample(genTable);
        //根据构建的条件查询数据
        return genTableMapper.selectByExample(example);
    }


    /**
     * GenTable构建查询对象
     * @param genTable
     * @return
     */
    public Example createExample(GenTable genTable){
        Example example=new Example(GenTable.class);
        Example.Criteria criteria = example.createCriteria();
        if(genTable!=null){
            // 编号
            if(!StringUtils.isEmpty(genTable.getTableId())){
                    criteria.andEqualTo("tableId",genTable.getTableId());
            }
            // 表名称
            if(!StringUtils.isEmpty(genTable.getTableName())){
                    criteria.andEqualTo("tableName",genTable.getTableName());
            }
            // 表描述
            if(!StringUtils.isEmpty(genTable.getTableComment())){
                    criteria.andEqualTo("tableComment",genTable.getTableComment());
            }
            // 关联子表的表名
            if(!StringUtils.isEmpty(genTable.getSubTableName())){
                    criteria.andEqualTo("subTableName",genTable.getSubTableName());
            }
            // 子表关联的外键名
            if(!StringUtils.isEmpty(genTable.getSubTableFkName())){
                    criteria.andEqualTo("subTableFkName",genTable.getSubTableFkName());
            }
            // 实体类名称
            if(!StringUtils.isEmpty(genTable.getClassName())){
                    criteria.andEqualTo("className",genTable.getClassName());
            }
            // 使用的模板（crud单表操作 tree树表操作）
            if(!StringUtils.isEmpty(genTable.getTplCategory())){
                    criteria.andEqualTo("tplCategory",genTable.getTplCategory());
            }
            // 生成包路径
            if(!StringUtils.isEmpty(genTable.getPackageName())){
                    criteria.andEqualTo("packageName",genTable.getPackageName());
            }
            // 生成模块名
            if(!StringUtils.isEmpty(genTable.getModuleName())){
                    criteria.andEqualTo("moduleName",genTable.getModuleName());
            }
            // 生成业务名
            if(!StringUtils.isEmpty(genTable.getBusinessName())){
                    criteria.andEqualTo("businessName",genTable.getBusinessName());
            }
            // 生成功能名
            if(!StringUtils.isEmpty(genTable.getFunctionName())){
                    criteria.andEqualTo("functionName",genTable.getFunctionName());
            }
            // 生成功能作者
            if(!StringUtils.isEmpty(genTable.getFunctionAuthor())){
                    criteria.andEqualTo("functionAuthor",genTable.getFunctionAuthor());
            }
            // 生成代码方式（0zip压缩包 1自定义路径）
            if(!StringUtils.isEmpty(genTable.getGenType())){
                    criteria.andEqualTo("genType",genTable.getGenType());
            }
            // 生成路径（不填默认项目路径）
            if(!StringUtils.isEmpty(genTable.getGenPath())){
                    criteria.andEqualTo("genPath",genTable.getGenPath());
            }
            // 其它生成选项
            if(!StringUtils.isEmpty(genTable.getOptions())){
                    criteria.andEqualTo("options",genTable.getOptions());
            }
            // 创建者
            if(!StringUtils.isEmpty(genTable.getCreateBy())){
                    criteria.andEqualTo("createBy",genTable.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(genTable.getCreateTime())){
                    criteria.andEqualTo("createTime",genTable.getCreateTime());
            }
            // 更新者
            if(!StringUtils.isEmpty(genTable.getUpdateBy())){
                    criteria.andEqualTo("updateBy",genTable.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(genTable.getUpdateTime())){
                    criteria.andEqualTo("updateTime",genTable.getUpdateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(genTable.getRemark())){
                    criteria.andEqualTo("remark",genTable.getRemark());
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
        genTableMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改GenTable
     * @param genTable
     */
    @Override
    public void update(GenTable genTable){
        genTableMapper.updateByPrimaryKey(genTable);
    }

    /**
     * 增加GenTable
     * @param genTable
     */
    @Override
    public void add(GenTable genTable){
        genTableMapper.insert(genTable);
    }

    /**
     * 根据ID查询GenTable
     * @param id
     * @return
     */
    @Override
    public GenTable findById(Long id){
        return  genTableMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询GenTable全部数据
     * @return
     */
    @Override
    public List<GenTable> findAll() {
        return genTableMapper.selectAll();
    }
}

package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstReconciliationMapper;
import com.alsyun.admin.pojo.DstReconciliation;
import com.alsyun.admin.service.DstReconciliationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstReconciliation业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstReconciliationServiceImpl implements DstReconciliationService {

    @Autowired
    private DstReconciliationMapper dstReconciliationMapper;


    /**
     * DstReconciliation条件+分页查询
     * @param dstReconciliation 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstReconciliation> findPage(DstReconciliation dstReconciliation, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstReconciliation);
        //执行搜索
        return new PageInfo<DstReconciliation>(dstReconciliationMapper.selectByExample(example));
    }

    /**
     * DstReconciliation分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstReconciliation> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstReconciliation>(dstReconciliationMapper.selectAll());
    }

    /**
     * DstReconciliation条件查询
     * @param dstReconciliation
     * @return
     */
    @Override
    public List<DstReconciliation> findList(DstReconciliation dstReconciliation){
        //构建查询条件
        Example example = createExample(dstReconciliation);
        //根据构建的条件查询数据
        return dstReconciliationMapper.selectByExample(example);
    }


    /**
     * DstReconciliation构建查询对象
     * @param dstReconciliation
     * @return
     */
    public Example createExample(DstReconciliation dstReconciliation){
        Example example=new Example(DstReconciliation.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstReconciliation!=null){
            // id
            if(!StringUtils.isEmpty(dstReconciliation.getId())){
                    criteria.andEqualTo("id",dstReconciliation.getId());
            }
            // 商铺id
            if(!StringUtils.isEmpty(dstReconciliation.getAccountId())){
                    criteria.andEqualTo("accountId",dstReconciliation.getAccountId());
            }
            // 商铺名称
            if(!StringUtils.isEmpty(dstReconciliation.getAccountName())){
                    criteria.andEqualTo("accountName",dstReconciliation.getAccountName());
            }
            // 收入
            if(!StringUtils.isEmpty(dstReconciliation.getIncome())){
                    criteria.andEqualTo("income",dstReconciliation.getIncome());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstReconciliation.getCreateBy())){
                    criteria.andEqualTo("createBy",dstReconciliation.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstReconciliation.getCreateTime())){
                    criteria.andEqualTo("createTime",dstReconciliation.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstReconciliation.getRemark())){
                    criteria.andEqualTo("remark",dstReconciliation.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstReconciliation.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstReconciliation.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstReconciliation.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstReconciliation.getUpdateTime());
            }
        }
        return example;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Integer id){
        dstReconciliationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstReconciliation
     * @param dstReconciliation
     */
    @Override
    public void update(DstReconciliation dstReconciliation){
        dstReconciliationMapper.updateByPrimaryKey(dstReconciliation);
    }

    /**
     * 增加DstReconciliation
     * @param dstReconciliation
     */
    @Override
    public void add(DstReconciliation dstReconciliation){
        dstReconciliationMapper.insert(dstReconciliation);
    }

    /**
     * 根据ID查询DstReconciliation
     * @param id
     * @return
     */
    @Override
    public DstReconciliation findById(Integer id){
        return  dstReconciliationMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstReconciliation全部数据
     * @return
     */
    @Override
    public List<DstReconciliation> findAll() {
        return dstReconciliationMapper.selectAll();
    }
}

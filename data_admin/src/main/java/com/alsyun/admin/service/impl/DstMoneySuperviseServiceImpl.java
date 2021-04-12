package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstMoneySuperviseMapper;
import com.alsyun.admin.pojo.DstMoneySupervise;
import com.alsyun.admin.service.DstMoneySuperviseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstMoneySupervise业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstMoneySuperviseServiceImpl implements DstMoneySuperviseService {

    @Autowired
    private DstMoneySuperviseMapper dstMoneySuperviseMapper;


    /**
     * DstMoneySupervise条件+分页查询
     * @param dstMoneySupervise 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstMoneySupervise> findPage(DstMoneySupervise dstMoneySupervise, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstMoneySupervise);
        //执行搜索
        return new PageInfo<DstMoneySupervise>(dstMoneySuperviseMapper.selectByExample(example));
    }

    /**
     * DstMoneySupervise分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstMoneySupervise> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstMoneySupervise>(dstMoneySuperviseMapper.selectAll());
    }

    /**
     * DstMoneySupervise条件查询
     * @param dstMoneySupervise
     * @return
     */
    @Override
    public List<DstMoneySupervise> findList(DstMoneySupervise dstMoneySupervise){
        //构建查询条件
        Example example = createExample(dstMoneySupervise);
        //根据构建的条件查询数据
        return dstMoneySuperviseMapper.selectByExample(example);
    }


    /**
     * DstMoneySupervise构建查询对象
     * @param dstMoneySupervise
     * @return
     */
    public Example createExample(DstMoneySupervise dstMoneySupervise){
        Example example=new Example(DstMoneySupervise.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstMoneySupervise!=null){
            // id
            if(!StringUtils.isEmpty(dstMoneySupervise.getId())){
                    criteria.andEqualTo("id",dstMoneySupervise.getId());
            }
            // 商品id
            if(!StringUtils.isEmpty(dstMoneySupervise.getOrderId())){
                    criteria.andEqualTo("orderId",dstMoneySupervise.getOrderId());
            }
            // 商品名称
            if(!StringUtils.isEmpty(dstMoneySupervise.getOrderName())){
                    criteria.andEqualTo("orderName",dstMoneySupervise.getOrderName());
            }
            // 支付方式（）
            if(!StringUtils.isEmpty(dstMoneySupervise.getPayMethod())){
                    criteria.andEqualTo("payMethod",dstMoneySupervise.getPayMethod());
            }
            // 交易类型
            if(!StringUtils.isEmpty(dstMoneySupervise.getPayType())){
                    criteria.andEqualTo("payType",dstMoneySupervise.getPayType());
            }
            // 交易金额
            if(!StringUtils.isEmpty(dstMoneySupervise.getPayMoney())){
                    criteria.andEqualTo("payMoney",dstMoneySupervise.getPayMoney());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstMoneySupervise.getCreateBy())){
                    criteria.andEqualTo("createBy",dstMoneySupervise.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstMoneySupervise.getCreateTime())){
                    criteria.andEqualTo("createTime",dstMoneySupervise.getCreateTime());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstMoneySupervise.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstMoneySupervise.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstMoneySupervise.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstMoneySupervise.getUpdateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstMoneySupervise.getRemark())){
                    criteria.andEqualTo("remark",dstMoneySupervise.getRemark());
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
        dstMoneySuperviseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstMoneySupervise
     * @param dstMoneySupervise
     */
    @Override
    public void update(DstMoneySupervise dstMoneySupervise){
        dstMoneySuperviseMapper.updateByPrimaryKey(dstMoneySupervise);
    }

    /**
     * 增加DstMoneySupervise
     * @param dstMoneySupervise
     */
    @Override
    public void add(DstMoneySupervise dstMoneySupervise){
        dstMoneySuperviseMapper.insert(dstMoneySupervise);
    }

    /**
     * 根据ID查询DstMoneySupervise
     * @param id
     * @return
     */
    @Override
    public DstMoneySupervise findById(Integer id){
        return  dstMoneySuperviseMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstMoneySupervise全部数据
     * @return
     */
    @Override
    public List<DstMoneySupervise> findAll() {
        return dstMoneySuperviseMapper.selectAll();
    }
}

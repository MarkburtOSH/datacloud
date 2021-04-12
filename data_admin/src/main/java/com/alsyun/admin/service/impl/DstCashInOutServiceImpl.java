package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstCashInOutMapper;
import com.alsyun.admin.pojo.DstCashInOut;
import com.alsyun.admin.service.DstCashInOutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstCashInOut业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstCashInOutServiceImpl implements DstCashInOutService {

    @Autowired
    private DstCashInOutMapper dstCashInOutMapper;


    /**
     * DstCashInOut条件+分页查询
     * @param dstCashInOut 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstCashInOut> findPage(DstCashInOut dstCashInOut, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstCashInOut);
        //执行搜索
        return new PageInfo<DstCashInOut>(dstCashInOutMapper.selectByExample(example));
    }

    /**
     * DstCashInOut分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstCashInOut> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstCashInOut>(dstCashInOutMapper.selectAll());
    }

    /**
     * DstCashInOut条件查询
     * @param dstCashInOut
     * @return
     */
    @Override
    public List<DstCashInOut> findList(DstCashInOut dstCashInOut){
        //构建查询条件
        Example example = createExample(dstCashInOut);
        //根据构建的条件查询数据
        return dstCashInOutMapper.selectByExample(example);
    }


    /**
     * DstCashInOut构建查询对象
     * @param dstCashInOut
     * @return
     */
    public Example createExample(DstCashInOut dstCashInOut){
        Example example=new Example(DstCashInOut.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstCashInOut!=null){
            // id
            if(!StringUtils.isEmpty(dstCashInOut.getId())){
                    criteria.andEqualTo("id",dstCashInOut.getId());
            }
            // 交易单号
            if(!StringUtils.isEmpty(dstCashInOut.getOddNumbers())){
                    criteria.andEqualTo("oddNumbers",dstCashInOut.getOddNumbers());
            }
            // 商铺id
            if(!StringUtils.isEmpty(dstCashInOut.getAccountId())){
                    criteria.andEqualTo("accountId",dstCashInOut.getAccountId());
            }
            // 商铺名称
            if(!StringUtils.isEmpty(dstCashInOut.getAccountName())){
                    criteria.andEqualTo("accountName",dstCashInOut.getAccountName());
            }
            // 交易数量
            if(!StringUtils.isEmpty(dstCashInOut.getAmount())){
                    criteria.andEqualTo("amount",dstCashInOut.getAmount());
            }
            // 物品单位
            if(!StringUtils.isEmpty(dstCashInOut.getUnit())){
                    criteria.andEqualTo("unit",dstCashInOut.getUnit());
            }
            // 交易金额
            if(!StringUtils.isEmpty(dstCashInOut.getAmountMoney())){
                    criteria.andEqualTo("amountMoney",dstCashInOut.getAmountMoney());
            }
            // 支付方式(0现金支付1微信支付2支付宝支付3聚合支付)
            if(!StringUtils.isEmpty(dstCashInOut.getPaymentMethod())){
                    criteria.andEqualTo("paymentMethod",dstCashInOut.getPaymentMethod());
            }
            // 交易状态（0已支付1未支付2待支付3撤单中4撤单完成)
            if(!StringUtils.isEmpty(dstCashInOut.getTradeState())){
                    criteria.andEqualTo("tradeState",dstCashInOut.getTradeState());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstCashInOut.getCreateBy())){
                    criteria.andEqualTo("createBy",dstCashInOut.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstCashInOut.getCreateTime())){
                    criteria.andEqualTo("createTime",dstCashInOut.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstCashInOut.getRemark())){
                    criteria.andEqualTo("remark",dstCashInOut.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstCashInOut.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstCashInOut.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstCashInOut.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstCashInOut.getUpdateTime());
            }
        }
        return example;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(String id){
        dstCashInOutMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstCashInOut
     * @param dstCashInOut
     */
    @Override
    public void update(DstCashInOut dstCashInOut){
        dstCashInOutMapper.updateByPrimaryKey(dstCashInOut);
    }

    /**
     * 增加DstCashInOut
     * @param dstCashInOut
     */
    @Override
    public void add(DstCashInOut dstCashInOut){
        dstCashInOutMapper.insert(dstCashInOut);
    }

    /**
     * 根据ID查询DstCashInOut
     * @param id
     * @return
     */
    @Override
    public DstCashInOut findById(String id){
        return  dstCashInOutMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstCashInOut全部数据
     * @return
     */
    @Override
    public List<DstCashInOut> findAll() {
        return dstCashInOutMapper.selectAll();
    }
}

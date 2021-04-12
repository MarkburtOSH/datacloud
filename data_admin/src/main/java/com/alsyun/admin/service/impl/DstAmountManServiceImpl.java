package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstAmountManMapper;
import com.alsyun.admin.pojo.DstAmountMan;
import com.alsyun.admin.service.DstAmountManService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstAmountMan业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstAmountManServiceImpl implements DstAmountManService {

    @Autowired
    private DstAmountManMapper dstAmountManMapper;


    /**
     * DstAmountMan条件+分页查询
     * @param dstAmountMan 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstAmountMan> findPage(DstAmountMan dstAmountMan, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstAmountMan);
        //执行搜索
        return new PageInfo<DstAmountMan>(dstAmountManMapper.selectByExample(example));
    }

    /**
     * DstAmountMan分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstAmountMan> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstAmountMan>(dstAmountManMapper.selectAll());
    }

    /**
     * DstAmountMan条件查询
     * @param dstAmountMan
     * @return
     */
    @Override
    public List<DstAmountMan> findList(DstAmountMan dstAmountMan){
        //构建查询条件
        Example example = createExample(dstAmountMan);
        //根据构建的条件查询数据
        return dstAmountManMapper.selectByExample(example);
    }


    /**
     * DstAmountMan构建查询对象
     * @param dstAmountMan
     * @return
     */
    public Example createExample(DstAmountMan dstAmountMan){
        Example example=new Example(DstAmountMan.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstAmountMan!=null){
            // id
            if(!StringUtils.isEmpty(dstAmountMan.getId())){
                    criteria.andEqualTo("id",dstAmountMan.getId());
            }
            // 交易单号
            if(!StringUtils.isEmpty(dstAmountMan.getOddNumbers())){
                    criteria.andEqualTo("oddNumbers",dstAmountMan.getOddNumbers());
            }
            // 商铺id
            if(!StringUtils.isEmpty(dstAmountMan.getAccountId())){
                    criteria.andEqualTo("accountId",dstAmountMan.getAccountId());
            }
            // 商铺名称
            if(!StringUtils.isEmpty(dstAmountMan.getAccountName())){
                    criteria.andEqualTo("accountName",dstAmountMan.getAccountName());
            }
            // 交易数量
            if(!StringUtils.isEmpty(dstAmountMan.getAmount())){
                    criteria.andEqualTo("amount",dstAmountMan.getAmount());
            }
            // 物品单位
            if(!StringUtils.isEmpty(dstAmountMan.getUnit())){
                    criteria.andEqualTo("unit",dstAmountMan.getUnit());
            }
            // 交易金额
            if(!StringUtils.isEmpty(dstAmountMan.getAmountMoney())){
                    criteria.andEqualTo("amountMoney",dstAmountMan.getAmountMoney());
            }
            // 付款方
            if(!StringUtils.isEmpty(dstAmountMan.getPaymentBy())){
                    criteria.andEqualTo("paymentBy",dstAmountMan.getPaymentBy());
            }
            // 付款方账号
            if(!StringUtils.isEmpty(dstAmountMan.getPaymentAccount())){
                    criteria.andEqualTo("paymentAccount",dstAmountMan.getPaymentAccount());
            }
            // 收款方
            if(!StringUtils.isEmpty(dstAmountMan.getCollectionBy())){
                    criteria.andEqualTo("collectionBy",dstAmountMan.getCollectionBy());
            }
            // 收款方账号
            if(!StringUtils.isEmpty(dstAmountMan.getCollectionAccount())){
                    criteria.andEqualTo("collectionAccount",dstAmountMan.getCollectionAccount());
            }
            // 佣金
            if(!StringUtils.isEmpty(dstAmountMan.getCommission())){
                    criteria.andEqualTo("commission",dstAmountMan.getCommission());
            }
            // 余额
            if(!StringUtils.isEmpty(dstAmountMan.getBalance())){
                    criteria.andEqualTo("balance",dstAmountMan.getBalance());
            }
            // 支付方式(0现金支付1微信支付2支付宝支付3聚合支付)
            if(!StringUtils.isEmpty(dstAmountMan.getPaymentMethod())){
                    criteria.andEqualTo("paymentMethod",dstAmountMan.getPaymentMethod());
            }
            // 交易状态（0已支付1未支付2待支付3撤单中4撤单完成)
            if(!StringUtils.isEmpty(dstAmountMan.getTradeState())){
                    criteria.andEqualTo("tradeState",dstAmountMan.getTradeState());
            }
            // 交易类型（出金方式，入金方式）
            if(!StringUtils.isEmpty(dstAmountMan.getInOutMode())){
                    criteria.andEqualTo("inOutMode",dstAmountMan.getInOutMode());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstAmountMan.getCreateBy())){
                    criteria.andEqualTo("createBy",dstAmountMan.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstAmountMan.getCreateTime())){
                    criteria.andEqualTo("createTime",dstAmountMan.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstAmountMan.getRemark())){
                    criteria.andEqualTo("remark",dstAmountMan.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstAmountMan.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstAmountMan.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstAmountMan.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstAmountMan.getUpdateTime());
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
        dstAmountManMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstAmountMan
     * @param dstAmountMan
     */
    @Override
    public void update(DstAmountMan dstAmountMan){
        dstAmountManMapper.updateByPrimaryKey(dstAmountMan);
    }

    /**
     * 增加DstAmountMan
     * @param dstAmountMan
     */
    @Override
    public void add(DstAmountMan dstAmountMan){
        dstAmountManMapper.insert(dstAmountMan);
    }

    /**
     * 根据ID查询DstAmountMan
     * @param id
     * @return
     */
    @Override
    public DstAmountMan findById(Integer id){
        return  dstAmountManMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstAmountMan全部数据
     * @return
     */
    @Override
    public List<DstAmountMan> findAll() {
        return dstAmountManMapper.selectAll();
    }
}

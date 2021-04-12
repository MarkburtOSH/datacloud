package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstMemberUserCardMapper;
import com.alsyun.admin.pojo.DstMemberUserCard;
import com.alsyun.admin.service.DstMemberUserCardService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstMemberUserCard业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstMemberUserCardServiceImpl implements DstMemberUserCardService {

    @Autowired
    private DstMemberUserCardMapper dstMemberUserCardMapper;


    /**
     * DstMemberUserCard条件+分页查询
     * @param dstMemberUserCard 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstMemberUserCard> findPage(DstMemberUserCard dstMemberUserCard, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstMemberUserCard);
        //执行搜索
        return new PageInfo<DstMemberUserCard>(dstMemberUserCardMapper.selectByExample(example));
    }

    /**
     * DstMemberUserCard分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstMemberUserCard> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstMemberUserCard>(dstMemberUserCardMapper.selectAll());
    }

    /**
     * DstMemberUserCard条件查询
     * @param dstMemberUserCard
     * @return
     */
    @Override
    public List<DstMemberUserCard> findList(DstMemberUserCard dstMemberUserCard){
        //构建查询条件
        Example example = createExample(dstMemberUserCard);
        //根据构建的条件查询数据
        return dstMemberUserCardMapper.selectByExample(example);
    }


    /**
     * DstMemberUserCard构建查询对象
     * @param dstMemberUserCard
     * @return
     */
    public Example createExample(DstMemberUserCard dstMemberUserCard){
        Example example=new Example(DstMemberUserCard.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstMemberUserCard!=null){
            // id
            if(!StringUtils.isEmpty(dstMemberUserCard.getId())){
                    criteria.andEqualTo("id",dstMemberUserCard.getId());
            }
            // 账户id
            if(!StringUtils.isEmpty(dstMemberUserCard.getUserId())){
                    criteria.andEqualTo("userId",dstMemberUserCard.getUserId());
            }
            // 持卡人
            if(!StringUtils.isEmpty(dstMemberUserCard.getCardholder())){
                    criteria.andEqualTo("cardholder",dstMemberUserCard.getCardholder());
            }
            // 银行卡号
            if(!StringUtils.isEmpty(dstMemberUserCard.getCardNumber())){
                    criteria.andEqualTo("cardNumber",dstMemberUserCard.getCardNumber());
            }
            // 银行卡预留手机号
            if(!StringUtils.isEmpty(dstMemberUserCard.getCardPhoneNumber())){
                    criteria.andEqualTo("cardPhoneNumber",dstMemberUserCard.getCardPhoneNumber());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstMemberUserCard.getCreateBy())){
                    criteria.andEqualTo("createBy",dstMemberUserCard.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstMemberUserCard.getCreateTime())){
                    criteria.andEqualTo("createTime",dstMemberUserCard.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstMemberUserCard.getRemark())){
                    criteria.andEqualTo("remark",dstMemberUserCard.getRemark());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstMemberUserCard.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstMemberUserCard.getUpdateTime());
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
        dstMemberUserCardMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstMemberUserCard
     * @param dstMemberUserCard
     */
    @Override
    public void update(DstMemberUserCard dstMemberUserCard){
        dstMemberUserCardMapper.updateByPrimaryKey(dstMemberUserCard);
    }

    /**
     * 增加DstMemberUserCard
     * @param dstMemberUserCard
     */
    @Override
    public void add(DstMemberUserCard dstMemberUserCard){
        dstMemberUserCardMapper.insert(dstMemberUserCard);
    }

    /**
     * 根据ID查询DstMemberUserCard
     * @param id
     * @return
     */
    @Override
    public DstMemberUserCard findById(Integer id){
        return  dstMemberUserCardMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstMemberUserCard全部数据
     * @return
     */
    @Override
    public List<DstMemberUserCard> findAll() {
        return dstMemberUserCardMapper.selectAll();
    }
}

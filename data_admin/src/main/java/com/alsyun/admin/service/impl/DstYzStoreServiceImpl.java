package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstYzStoreMapper;
import com.alsyun.admin.pojo.DstYzStore;
import com.alsyun.admin.service.DstYzStoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstYzStore业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstYzStoreServiceImpl implements DstYzStoreService {

    @Autowired
    private DstYzStoreMapper dstYzStoreMapper;


    /**
     * DstYzStore条件+分页查询
     * @param dstYzStore 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstYzStore> findPage(DstYzStore dstYzStore, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstYzStore);
        //执行搜索
        return new PageInfo<DstYzStore>(dstYzStoreMapper.selectByExample(example));
    }

    /**
     * DstYzStore分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstYzStore> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstYzStore>(dstYzStoreMapper.selectAll());
    }

    /**
     * DstYzStore条件查询
     * @param dstYzStore
     * @return
     */
    @Override
    public List<DstYzStore> findList(DstYzStore dstYzStore){
        //构建查询条件
        Example example = createExample(dstYzStore);
        //根据构建的条件查询数据
        return dstYzStoreMapper.selectByExample(example);
    }


    /**
     * DstYzStore构建查询对象
     * @param dstYzStore
     * @return
     */
    public Example createExample(DstYzStore dstYzStore){
        Example example=new Example(DstYzStore.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstYzStore!=null){
            // 
            if(!StringUtils.isEmpty(dstYzStore.getId())){
                    criteria.andEqualTo("id",dstYzStore.getId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getUniacid())){
                    criteria.andEqualTo("uniacid",dstYzStore.getUniacid());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getUid())){
                    criteria.andEqualTo("uid",dstYzStore.getUid());
            }
            // 店铺名称
            if(!StringUtils.isEmpty(dstYzStore.getStoreName())){
                    criteria.andEqualTo("storeName",dstYzStore.getStoreName());
            }
            // 店铺权重
            if(!StringUtils.isEmpty(dstYzStore.getWeight())){
                    criteria.andEqualTo("weight",dstYzStore.getWeight());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getThumb())){
                    criteria.andEqualTo("thumb",dstYzStore.getThumb());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getCategoryId())){
                    criteria.andEqualTo("categoryId",dstYzStore.getCategoryId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getProvinceId())){
                    criteria.andEqualTo("provinceId",dstYzStore.getProvinceId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getCityId())){
                    criteria.andEqualTo("cityId",dstYzStore.getCityId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getDistrictId())){
                    criteria.andEqualTo("districtId",dstYzStore.getDistrictId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getStreetId())){
                    criteria.andEqualTo("streetId",dstYzStore.getStreetId());
            }
            // 地址
            if(!StringUtils.isEmpty(dstYzStore.getAddress())){
                    criteria.andEqualTo("address",dstYzStore.getAddress());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getLongitude())){
                    criteria.andEqualTo("longitude",dstYzStore.getLongitude());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getLatitude())){
                    criteria.andEqualTo("latitude",dstYzStore.getLatitude());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getMobile())){
                    criteria.andEqualTo("mobile",dstYzStore.getMobile());
            }
            // 门店介绍
            if(!StringUtils.isEmpty(dstYzStore.getStoreIntroduce())){
                    criteria.andEqualTo("storeIntroduce",dstYzStore.getStoreIntroduce());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getUsername())){
                    criteria.andLike("username","%"+dstYzStore.getUsername()+"%");
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getPassword())){
                    criteria.andEqualTo("password",dstYzStore.getPassword());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getTemplateId())){
                    criteria.andEqualTo("templateId",dstYzStore.getTemplateId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getSalers())){
                    criteria.andEqualTo("salers",dstYzStore.getSalers());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getCashierId())){
                    criteria.andEqualTo("cashierId",dstYzStore.getCashierId());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getCreatedAt())){
                    criteria.andEqualTo("createdAt",dstYzStore.getCreatedAt());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getUpdatedAt())){
                    criteria.andEqualTo("updatedAt",dstYzStore.getUpdatedAt());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getDeletedAt())){
                    criteria.andEqualTo("deletedAt",dstYzStore.getDeletedAt());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getBusinessHoursStart())){
                    criteria.andEqualTo("businessHoursStart",dstYzStore.getBusinessHoursStart());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getBusinessHoursEnd())){
                    criteria.andEqualTo("businessHoursEnd",dstYzStore.getBusinessHoursEnd());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getAptitudeImgs())){
                    criteria.andEqualTo("aptitudeImgs",dstYzStore.getAptitudeImgs());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getDispatchType())){
                    criteria.andEqualTo("dispatchType",dstYzStore.getDispatchType());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getAffiche())){
                    criteria.andEqualTo("affiche",dstYzStore.getAffiche());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getUserUid())){
                    criteria.andEqualTo("userUid",dstYzStore.getUserUid());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getInformation())){
                    criteria.andEqualTo("information",dstYzStore.getInformation());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getIsBlack())){
                    criteria.andEqualTo("isBlack",dstYzStore.getIsBlack());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getBannerThumb())){
                    criteria.andEqualTo("bannerThumb",dstYzStore.getBannerThumb());
            }
            // 0:显示/1:隐藏
            if(!StringUtils.isEmpty(dstYzStore.getIsHide())){
                    criteria.andEqualTo("isHide",dstYzStore.getIsHide());
            }
            // 0:首页/1:商品页...
            if(!StringUtils.isEmpty(dstYzStore.getSpecifyShow())){
                    criteria.andEqualTo("specifyShow",dstYzStore.getSpecifyShow());
            }
            // 0：经营/1:休息
            if(!StringUtils.isEmpty(dstYzStore.getOperatingState())){
                    criteria.andEqualTo("operatingState",dstYzStore.getOperatingState());
            }
            // 老板uid
            if(!StringUtils.isEmpty(dstYzStore.getBossUid())){
                    criteria.andEqualTo("bossUid",dstYzStore.getBossUid());
            }
            // 0:关闭|1：开启
            if(!StringUtils.isEmpty(dstYzStore.getAudioOpen())){
                    criteria.andEqualTo("audioOpen",dstYzStore.getAudioOpen());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getInitials())){
                    criteria.andEqualTo("initials",dstYzStore.getInitials());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getValidity())){
                    criteria.andEqualTo("validity",dstYzStore.getValidity());
            }
            // 1失效
            if(!StringUtils.isEmpty(dstYzStore.getValidityStatus())){
                    criteria.andEqualTo("validityStatus",dstYzStore.getValidityStatus());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getIdCardImgs())){
                    criteria.andEqualTo("idCardImgs",dstYzStore.getIdCardImgs());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getOtherImgs())){
                    criteria.andEqualTo("otherImgs",dstYzStore.getOtherImgs());
            }
            // 云喇叭iemi值
            if(!StringUtils.isEmpty(dstYzStore.getYunHorn())){
                    criteria.andEqualTo("yunHorn",dstYzStore.getYunHorn());
            }
            // zkc支付iemi值
            if(!StringUtils.isEmpty(dstYzStore.getZkcPay())){
                    criteria.andEqualTo("zkcPay",dstYzStore.getZkcPay());
            }
            // 
            if(!StringUtils.isEmpty(dstYzStore.getSalt())){
                    criteria.andEqualTo("salt",dstYzStore.getSalt());
            }
            // 首页小程序二维码地址
            if(!StringUtils.isEmpty(dstYzStore.getHomeStoreUrl())){
                    criteria.andEqualTo("homeStoreUrl",dstYzStore.getHomeStoreUrl());
            }
            // 商品页小程序二维码地址
            if(!StringUtils.isEmpty(dstYzStore.getGoodsStoreUrl())){
                    criteria.andEqualTo("goodsStoreUrl",dstYzStore.getGoodsStoreUrl());
            }
            // 收银台小程序二维码地址
            if(!StringUtils.isEmpty(dstYzStore.getCollectMoneyUrl())){
                    criteria.andEqualTo("collectMoneyUrl",dstYzStore.getCollectMoneyUrl());
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
        dstYzStoreMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstYzStore
     * @param dstYzStore
     */
    @Override
    public void update(DstYzStore dstYzStore){
        dstYzStoreMapper.updateByPrimaryKey(dstYzStore);
    }

    /**
     * 增加DstYzStore
     * @param dstYzStore
     */
    @Override
    public void add(DstYzStore dstYzStore){
        dstYzStoreMapper.insert(dstYzStore);
    }

    /**
     * 根据ID查询DstYzStore
     * @param id
     * @return
     */
    @Override
    public DstYzStore findById(Integer id){
        return  dstYzStoreMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstYzStore全部数据
     * @return
     */
    @Override
    public List<DstYzStore> findAll() {
        return dstYzStoreMapper.selectAll();
    }
}

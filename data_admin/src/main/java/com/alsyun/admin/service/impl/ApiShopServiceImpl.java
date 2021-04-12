package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.ApiShopMapper;
import com.alsyun.admin.pojo.ApiShop;
import com.alsyun.admin.service.ApiShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:ApiShop业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class ApiShopServiceImpl implements ApiShopService {

    @Autowired
    private ApiShopMapper apiShopMapper;


    /**
     * ApiShop条件+分页查询
     * @param apiShop 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<ApiShop> findPage(ApiShop apiShop, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(apiShop);
        //执行搜索
        return new PageInfo<ApiShop>(apiShopMapper.selectByExample(example));
    }

    /**
     * ApiShop分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<ApiShop> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<ApiShop>(apiShopMapper.selectAll());
    }

    /**
     * ApiShop条件查询
     * @param apiShop
     * @return
     */
    @Override
    public List<ApiShop> findList(ApiShop apiShop){
        //构建查询条件
        Example example = createExample(apiShop);
        //根据构建的条件查询数据
        return apiShopMapper.selectByExample(example);
    }


    /**
     * ApiShop构建查询对象
     * @param apiShop
     * @return
     */
    public Example createExample(ApiShop apiShop){
        Example example=new Example(ApiShop.class);
        Example.Criteria criteria = example.createCriteria();
        if(apiShop!=null){
            // 
            if(!StringUtils.isEmpty(apiShop.getId())){
                    criteria.andEqualTo("id",apiShop.getId());
            }
            // 第三方平台id
            if(!StringUtils.isEmpty(apiShop.getYzId())){
                    criteria.andEqualTo("yzId",apiShop.getYzId());
            }
            // 门店名称
            if(!StringUtils.isEmpty(apiShop.getShopName())){
                    criteria.andEqualTo("shopName",apiShop.getShopName());
            }
            // 门店id
            if(!StringUtils.isEmpty(apiShop.getShopId())){
                    criteria.andEqualTo("shopId",apiShop.getShopId());
            }
            // 类型0 门店 1 酒店
            if(!StringUtils.isEmpty(apiShop.getType())){
                    criteria.andEqualTo("type",apiShop.getType());
            }
            // 所属平台  0  富蕴电商平台  1  0距离
            if(!StringUtils.isEmpty(apiShop.getPingtai())){
                    criteria.andEqualTo("pingtai",apiShop.getPingtai());
            }
            // 门店用户名
            if(!StringUtils.isEmpty(apiShop.getUsername())){
                    criteria.andLike("username","%"+apiShop.getUsername()+"%");
            }
            // 备注
            if(!StringUtils.isEmpty(apiShop.getNote())){
                    criteria.andEqualTo("note",apiShop.getNote());
            }
            // 状态   -1 暂停 0 有效  
            if(!StringUtils.isEmpty(apiShop.getStatus())){
                    criteria.andEqualTo("status",apiShop.getStatus());
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
        apiShopMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改ApiShop
     * @param apiShop
     */
    @Override
    public void update(ApiShop apiShop){
        apiShopMapper.updateByPrimaryKey(apiShop);
    }

    /**
     * 增加ApiShop
     * @param apiShop
     */
    @Override
    public void add(ApiShop apiShop){
        apiShopMapper.insert(apiShop);
    }

    /**
     * 根据ID查询ApiShop
     * @param id
     * @return
     */
    @Override
    public ApiShop findById(Long id){
        return  apiShopMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询ApiShop全部数据
     * @return
     */
    @Override
    public List<ApiShop> findAll() {
        return apiShopMapper.selectAll();
    }
}

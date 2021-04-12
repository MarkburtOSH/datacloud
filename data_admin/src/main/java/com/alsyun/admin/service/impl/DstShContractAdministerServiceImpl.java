package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstShContractAdministerMapper;
import com.alsyun.admin.pojo.DstShContractAdminister;
import com.alsyun.admin.service.DstShContractAdministerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstShContractAdminister业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstShContractAdministerServiceImpl implements DstShContractAdministerService {

    @Autowired
    private DstShContractAdministerMapper dstShContractAdministerMapper;


    /**
     * DstShContractAdminister条件+分页查询
     * @param dstShContractAdminister 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstShContractAdminister> findPage(DstShContractAdminister dstShContractAdminister, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstShContractAdminister);
        //执行搜索
        return new PageInfo<DstShContractAdminister>(dstShContractAdministerMapper.selectByExample(example));
    }

    /**
     * DstShContractAdminister分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstShContractAdminister> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstShContractAdminister>(dstShContractAdministerMapper.selectAll());
    }

    /**
     * DstShContractAdminister条件查询
     * @param dstShContractAdminister
     * @return
     */
    @Override
    public List<DstShContractAdminister> findList(DstShContractAdminister dstShContractAdminister){
        //构建查询条件
        Example example = createExample(dstShContractAdminister);
        //根据构建的条件查询数据
        return dstShContractAdministerMapper.selectByExample(example);
    }


    /**
     * DstShContractAdminister构建查询对象
     * @param dstShContractAdminister
     * @return
     */
    public Example createExample(DstShContractAdminister dstShContractAdminister){
        Example example=new Example(DstShContractAdminister.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstShContractAdminister!=null){
            // id
            if(!StringUtils.isEmpty(dstShContractAdminister.getId())){
                    criteria.andEqualTo("id",dstShContractAdminister.getId());
            }
            // 账户id
            if(!StringUtils.isEmpty(dstShContractAdminister.getAccountId())){
                    criteria.andEqualTo("accountId",dstShContractAdminister.getAccountId());
            }
            // 商户名称
            if(!StringUtils.isEmpty(dstShContractAdminister.getAccountName())){
                    criteria.andEqualTo("accountName",dstShContractAdminister.getAccountName());
            }
            // 法人
            if(!StringUtils.isEmpty(dstShContractAdminister.getLegalPerson())){
                    criteria.andEqualTo("legalPerson",dstShContractAdminister.getLegalPerson());
            }
            // 手机号
            if(!StringUtils.isEmpty(dstShContractAdminister.getPhonenumber())){
                    criteria.andEqualTo("phonenumber",dstShContractAdminister.getPhonenumber());
            }
            // 法人身份证号
            if(!StringUtils.isEmpty(dstShContractAdminister.getAuthenticate())){
                    criteria.andEqualTo("authenticate",dstShContractAdminister.getAuthenticate());
            }
            // 法人身份证照片正面
            if(!StringUtils.isEmpty(dstShContractAdminister.getCorporImgOne())){
                    criteria.andEqualTo("corporImgOne",dstShContractAdminister.getCorporImgOne());
            }
            // 法人身份证照片反面
            if(!StringUtils.isEmpty(dstShContractAdminister.getCorporImgTwo())){
                    criteria.andEqualTo("corporImgTwo",dstShContractAdminister.getCorporImgTwo());
            }
            // 营业执照照片
            if(!StringUtils.isEmpty(dstShContractAdminister.getCreditImg())){
                    criteria.andEqualTo("creditImg",dstShContractAdminister.getCreditImg());
            }
            // 删除标志（0正常，1停用，2删除）
            if(!StringUtils.isEmpty(dstShContractAdminister.getDelFlag())){
                    criteria.andEqualTo("delFlag",dstShContractAdminister.getDelFlag());
            }
            // 审核状态（0成功，1正在审核，2审核失败）
            if(!StringUtils.isEmpty(dstShContractAdminister.getExamine())){
                    criteria.andEqualTo("examine",dstShContractAdminister.getExamine());
            }
            // 名单管理（0正常，1白名单，2黑名单）
            if(!StringUtils.isEmpty(dstShContractAdminister.getRosterType())){
                    criteria.andEqualTo("rosterType",dstShContractAdminister.getRosterType());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstShContractAdminister.getCreateBy())){
                    criteria.andEqualTo("createBy",dstShContractAdminister.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstShContractAdminister.getCreateTime())){
                    criteria.andEqualTo("createTime",dstShContractAdminister.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstShContractAdminister.getRemark())){
                    criteria.andEqualTo("remark",dstShContractAdminister.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstShContractAdminister.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstShContractAdminister.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstShContractAdminister.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstShContractAdminister.getUpdateTime());
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
        dstShContractAdministerMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstShContractAdminister
     * @param dstShContractAdminister
     */
    @Override
    public void update(DstShContractAdminister dstShContractAdminister){
        dstShContractAdministerMapper.updateByPrimaryKey(dstShContractAdminister);
    }

    /**
     * 增加DstShContractAdminister
     * @param dstShContractAdminister
     */
    @Override
    public void add(DstShContractAdminister dstShContractAdminister){
        dstShContractAdministerMapper.insert(dstShContractAdminister);
    }

    /**
     * 根据ID查询DstShContractAdminister
     * @param id
     * @return
     */
    @Override
    public DstShContractAdminister findById(Integer id){
        return  dstShContractAdministerMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstShContractAdminister全部数据
     * @return
     */
    @Override
    public List<DstShContractAdminister> findAll() {
        return dstShContractAdministerMapper.selectAll();
    }
}

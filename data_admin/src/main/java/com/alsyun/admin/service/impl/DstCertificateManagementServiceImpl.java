package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstCertificateManagementMapper;
import com.alsyun.admin.pojo.DstCertificateManagement;
import com.alsyun.admin.service.DstCertificateManagementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstCertificateManagement业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstCertificateManagementServiceImpl implements DstCertificateManagementService {

    @Autowired
    private DstCertificateManagementMapper dstCertificateManagementMapper;


    /**
     * DstCertificateManagement条件+分页查询
     * @param dstCertificateManagement 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstCertificateManagement> findPage(DstCertificateManagement dstCertificateManagement, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstCertificateManagement);
        //执行搜索
        return new PageInfo<DstCertificateManagement>(dstCertificateManagementMapper.selectByExample(example));
    }

    /**
     * DstCertificateManagement分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstCertificateManagement> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstCertificateManagement>(dstCertificateManagementMapper.selectAll());
    }

    /**
     * DstCertificateManagement条件查询
     * @param dstCertificateManagement
     * @return
     */
    @Override
    public List<DstCertificateManagement> findList(DstCertificateManagement dstCertificateManagement){
        //构建查询条件
        Example example = createExample(dstCertificateManagement);
        //根据构建的条件查询数据
        return dstCertificateManagementMapper.selectByExample(example);
    }


    /**
     * DstCertificateManagement构建查询对象
     * @param dstCertificateManagement
     * @return
     */
    public Example createExample(DstCertificateManagement dstCertificateManagement){
        Example example=new Example(DstCertificateManagement.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstCertificateManagement!=null){
            // id
            if(!StringUtils.isEmpty(dstCertificateManagement.getId())){
                    criteria.andEqualTo("id",dstCertificateManagement.getId());
            }
            // 账号id
            if(!StringUtils.isEmpty(dstCertificateManagement.getAccountId())){
                    criteria.andEqualTo("accountId",dstCertificateManagement.getAccountId());
            }
            // 证书号
            if(!StringUtils.isEmpty(dstCertificateManagement.getCertificate())){
                    criteria.andEqualTo("certificate",dstCertificateManagement.getCertificate());
            }
            // 证书照片
            if(!StringUtils.isEmpty(dstCertificateManagement.getCertificateImg())){
                    criteria.andEqualTo("certificateImg",dstCertificateManagement.getCertificateImg());
            }
            // 审核状态（0成功，1正在审核，2审核失败）
            if(!StringUtils.isEmpty(dstCertificateManagement.getExamine())){
                    criteria.andEqualTo("examine",dstCertificateManagement.getExamine());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstCertificateManagement.getCreateBy())){
                    criteria.andEqualTo("createBy",dstCertificateManagement.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstCertificateManagement.getCreateTime())){
                    criteria.andEqualTo("createTime",dstCertificateManagement.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstCertificateManagement.getRemark())){
                    criteria.andEqualTo("remark",dstCertificateManagement.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstCertificateManagement.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstCertificateManagement.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstCertificateManagement.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstCertificateManagement.getUpdateTime());
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
        dstCertificateManagementMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstCertificateManagement
     * @param dstCertificateManagement
     */
    @Override
    public void update(DstCertificateManagement dstCertificateManagement){
        dstCertificateManagementMapper.updateByPrimaryKey(dstCertificateManagement);
    }

    /**
     * 增加DstCertificateManagement
     * @param dstCertificateManagement
     */
    @Override
    public void add(DstCertificateManagement dstCertificateManagement){
        dstCertificateManagementMapper.insert(dstCertificateManagement);
    }

    /**
     * 根据ID查询DstCertificateManagement
     * @param id
     * @return
     */
    @Override
    public DstCertificateManagement findById(Integer id){
        return  dstCertificateManagementMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstCertificateManagement全部数据
     * @return
     */
    @Override
    public List<DstCertificateManagement> findAll() {
        return dstCertificateManagementMapper.selectAll();
    }
}

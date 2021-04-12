package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstAccountMapper;
import com.alsyun.admin.pojo.DstAccount;
import com.alsyun.admin.service.DstAccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstAccount业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstAccountServiceImpl implements DstAccountService {

    @Autowired
    private DstAccountMapper dstAccountMapper;


    /**
     * DstAccount条件+分页查询
     * @param dstAccount 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstAccount> findPage(DstAccount dstAccount, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstAccount);
        //执行搜索
        return new PageInfo<DstAccount>(dstAccountMapper.selectByExample(example));
    }

    /**
     * DstAccount分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstAccount> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstAccount>(dstAccountMapper.selectAll());
    }

    /**
     * DstAccount条件查询
     * @param dstAccount
     * @return
     */
    @Override
    public List<DstAccount> findList(DstAccount dstAccount){
        //构建查询条件
        Example example = createExample(dstAccount);
        //根据构建的条件查询数据
        return dstAccountMapper.selectByExample(example);
    }


    /**
     * DstAccount构建查询对象
     * @param dstAccount
     * @return
     */
    public Example createExample(DstAccount dstAccount){
        Example example=new Example(DstAccount.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstAccount!=null){
            // id
            if(!StringUtils.isEmpty(dstAccount.getId())){
                    criteria.andEqualTo("id",dstAccount.getId());
            }
            // 账户id
            if(!StringUtils.isEmpty(dstAccount.getAccountId())){
                    criteria.andEqualTo("accountId",dstAccount.getAccountId());
            }
            // 开户名称
            if(!StringUtils.isEmpty(dstAccount.getAccountName())){
                    criteria.andEqualTo("accountName",dstAccount.getAccountName());
            }
            // 法人
            if(!StringUtils.isEmpty(dstAccount.getLegalPerson())){
                    criteria.andEqualTo("legalPerson",dstAccount.getLegalPerson());
            }
            // 电话
            if(!StringUtils.isEmpty(dstAccount.getPhone())){
                    criteria.andEqualTo("phone",dstAccount.getPhone());
            }
            // 余额
            if(!StringUtils.isEmpty(dstAccount.getRemainder())){
                    criteria.andEqualTo("remainder",dstAccount.getRemainder());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstAccount.getCreateBy())){
                    criteria.andEqualTo("createBy",dstAccount.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstAccount.getCreateTime())){
                    criteria.andEqualTo("createTime",dstAccount.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstAccount.getRemark())){
                    criteria.andEqualTo("remark",dstAccount.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstAccount.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstAccount.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstAccount.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstAccount.getUpdateTime());
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
        dstAccountMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstAccount
     * @param dstAccount
     */
    @Override
    public void update(DstAccount dstAccount){
        dstAccountMapper.updateByPrimaryKey(dstAccount);
    }

    /**
     * 增加DstAccount
     * @param dstAccount
     */
    @Override
    public void add(DstAccount dstAccount){
        dstAccountMapper.insert(dstAccount);
    }

    /**
     * 根据ID查询DstAccount
     * @param id
     * @return
     */
    @Override
    public DstAccount findById(Integer id){
        return  dstAccountMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstAccount全部数据
     * @return
     */
    @Override
    public List<DstAccount> findAll() {
        return dstAccountMapper.selectAll();
    }
}

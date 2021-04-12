package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstNotificationMapper;
import com.alsyun.admin.pojo.DstNotification;
import com.alsyun.admin.service.DstNotificationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstNotification业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstNotificationServiceImpl implements DstNotificationService {

    @Autowired
    private DstNotificationMapper dstNotificationMapper;


    /**
     * DstNotification条件+分页查询
     * @param dstNotification 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstNotification> findPage(DstNotification dstNotification, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstNotification);
        //执行搜索
        return new PageInfo<DstNotification>(dstNotificationMapper.selectByExample(example));
    }

    /**
     * DstNotification分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstNotification> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstNotification>(dstNotificationMapper.selectAll());
    }

    /**
     * DstNotification条件查询
     * @param dstNotification
     * @return
     */
    @Override
    public List<DstNotification> findList(DstNotification dstNotification){
        //构建查询条件
        Example example = createExample(dstNotification);
        //根据构建的条件查询数据
        return dstNotificationMapper.selectByExample(example);
    }


    /**
     * DstNotification构建查询对象
     * @param dstNotification
     * @return
     */
    public Example createExample(DstNotification dstNotification){
        Example example=new Example(DstNotification.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstNotification!=null){
            // id
            if(!StringUtils.isEmpty(dstNotification.getId())){
                    criteria.andEqualTo("id",dstNotification.getId());
            }
            // 账号id
            if(!StringUtils.isEmpty(dstNotification.getAccountId())){
                    criteria.andEqualTo("accountId",dstNotification.getAccountId());
            }
            // 标题
            if(!StringUtils.isEmpty(dstNotification.getTitle())){
                    criteria.andLike("title","%"+dstNotification.getTitle()+"%");
            }
            // 内容
            if(!StringUtils.isEmpty(dstNotification.getContent())){
                    criteria.andEqualTo("content",dstNotification.getContent());
            }
            // 审核状态（0成功，1正在审核，2审核失败）
            if(!StringUtils.isEmpty(dstNotification.getExamine())){
                    criteria.andEqualTo("examine",dstNotification.getExamine());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstNotification.getCreateBy())){
                    criteria.andEqualTo("createBy",dstNotification.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstNotification.getCreateTime())){
                    criteria.andEqualTo("createTime",dstNotification.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstNotification.getRemark())){
                    criteria.andEqualTo("remark",dstNotification.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstNotification.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstNotification.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstNotification.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstNotification.getUpdateTime());
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
        dstNotificationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstNotification
     * @param dstNotification
     */
    @Override
    public void update(DstNotification dstNotification){
        dstNotificationMapper.updateByPrimaryKey(dstNotification);
    }

    /**
     * 增加DstNotification
     * @param dstNotification
     */
    @Override
    public void add(DstNotification dstNotification){
        dstNotificationMapper.insert(dstNotification);
    }

    /**
     * 根据ID查询DstNotification
     * @param id
     * @return
     */
    @Override
    public DstNotification findById(Integer id){
        return  dstNotificationMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstNotification全部数据
     * @return
     */
    @Override
    public List<DstNotification> findAll() {
        return dstNotificationMapper.selectAll();
    }
}

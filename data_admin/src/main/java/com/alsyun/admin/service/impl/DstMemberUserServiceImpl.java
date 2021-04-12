package com.alsyun.admin.service.impl;

import com.alsyun.admin.dao.DstMemberUserMapper;
import com.alsyun.admin.pojo.DstMemberUser;
import com.alsyun.admin.service.DstMemberUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstMemberUser业务层接口实现类
 * @Date 2019/6/14 0:16
 *****/
@Service
public class DstMemberUserServiceImpl implements DstMemberUserService {

    @Autowired
    private DstMemberUserMapper dstMemberUserMapper;


    /**
     * DstMemberUser条件+分页查询
     * @param dstMemberUser 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public PageInfo<DstMemberUser> findPage(DstMemberUser dstMemberUser, int page, int size){
        //分页
        PageHelper.startPage(page,size);
        //搜索条件构建
        Example example = createExample(dstMemberUser);
        //执行搜索
        return new PageInfo<DstMemberUser>(dstMemberUserMapper.selectByExample(example));
    }

    /**
     * DstMemberUser分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<DstMemberUser> findPage(int page, int size){
        //静态分页
        PageHelper.startPage(page,size);
        //分页查询
        return new PageInfo<DstMemberUser>(dstMemberUserMapper.selectAll());
    }

    /**
     * DstMemberUser条件查询
     * @param dstMemberUser
     * @return
     */
    @Override
    public List<DstMemberUser> findList(DstMemberUser dstMemberUser){
        //构建查询条件
        Example example = createExample(dstMemberUser);
        //根据构建的条件查询数据
        return dstMemberUserMapper.selectByExample(example);
    }


    /**
     * DstMemberUser构建查询对象
     * @param dstMemberUser
     * @return
     */
    public Example createExample(DstMemberUser dstMemberUser){
        Example example=new Example(DstMemberUser.class);
        Example.Criteria criteria = example.createCriteria();
        if(dstMemberUser!=null){
            // id
            if(!StringUtils.isEmpty(dstMemberUser.getId())){
                    criteria.andEqualTo("id",dstMemberUser.getId());
            }
            // 账户id
            if(!StringUtils.isEmpty(dstMemberUser.getUserId())){
                    criteria.andEqualTo("userId",dstMemberUser.getUserId());
            }
            // 账户名
            if(!StringUtils.isEmpty(dstMemberUser.getUserName())){
                    criteria.andEqualTo("userName",dstMemberUser.getUserName());
            }
            // 密码
            if(!StringUtils.isEmpty(dstMemberUser.getPassword())){
                    criteria.andEqualTo("password",dstMemberUser.getPassword());
            }
            // 手机号
            if(!StringUtils.isEmpty(dstMemberUser.getPhonenumber())){
                    criteria.andEqualTo("phonenumber",dstMemberUser.getPhonenumber());
            }
            // 法人身份证号
            if(!StringUtils.isEmpty(dstMemberUser.getAuthenticate())){
                    criteria.andEqualTo("authenticate",dstMemberUser.getAuthenticate());
            }
            // 法人身份证照片正面
            if(!StringUtils.isEmpty(dstMemberUser.getCorporImgOne())){
                    criteria.andEqualTo("corporImgOne",dstMemberUser.getCorporImgOne());
            }
            // 法人身份证照片反面
            if(!StringUtils.isEmpty(dstMemberUser.getCorporImgTwo())){
                    criteria.andEqualTo("corporImgTwo",dstMemberUser.getCorporImgTwo());
            }
            // 营业执照照片
            if(!StringUtils.isEmpty(dstMemberUser.getCreditImg())){
                    criteria.andEqualTo("creditImg",dstMemberUser.getCreditImg());
            }
            // 佣金%
            if(!StringUtils.isEmpty(dstMemberUser.getCommission())){
                    criteria.andEqualTo("commission",dstMemberUser.getCommission());
            }
            // 余额
            if(!StringUtils.isEmpty(dstMemberUser.getRemainder())){
                    criteria.andEqualTo("remainder",dstMemberUser.getRemainder());
            }
            // 会员类型（0个人会员，1企业会员）
            if(!StringUtils.isEmpty(dstMemberUser.getUserType())){
                    criteria.andEqualTo("userType",dstMemberUser.getUserType());
            }
            // 删除标志（0正常，1停用，2删除）
            if(!StringUtils.isEmpty(dstMemberUser.getDelFlag())){
                    criteria.andEqualTo("delFlag",dstMemberUser.getDelFlag());
            }
            // 审核状态（0成功，1正在审核，2审核失败）
            if(!StringUtils.isEmpty(dstMemberUser.getExamine())){
                    criteria.andEqualTo("examine",dstMemberUser.getExamine());
            }
            // 名单管理（0正常，1白名单，2黑名单）
            if(!StringUtils.isEmpty(dstMemberUser.getRosterType())){
                    criteria.andEqualTo("rosterType",dstMemberUser.getRosterType());
            }
            // 创建人
            if(!StringUtils.isEmpty(dstMemberUser.getCreateBy())){
                    criteria.andEqualTo("createBy",dstMemberUser.getCreateBy());
            }
            // 创建时间
            if(!StringUtils.isEmpty(dstMemberUser.getCreateTime())){
                    criteria.andEqualTo("createTime",dstMemberUser.getCreateTime());
            }
            // 备注
            if(!StringUtils.isEmpty(dstMemberUser.getRemark())){
                    criteria.andEqualTo("remark",dstMemberUser.getRemark());
            }
            // 更新人
            if(!StringUtils.isEmpty(dstMemberUser.getUpdateBy())){
                    criteria.andEqualTo("updateBy",dstMemberUser.getUpdateBy());
            }
            // 更新时间
            if(!StringUtils.isEmpty(dstMemberUser.getUpdateTime())){
                    criteria.andEqualTo("updateTime",dstMemberUser.getUpdateTime());
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
        dstMemberUserMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改DstMemberUser
     * @param dstMemberUser
     */
    @Override
    public void update(DstMemberUser dstMemberUser){
        dstMemberUserMapper.updateByPrimaryKey(dstMemberUser);
    }

    /**
     * 增加DstMemberUser
     * @param dstMemberUser
     */
    @Override
    public void add(DstMemberUser dstMemberUser){
        dstMemberUserMapper.insert(dstMemberUser);
    }

    /**
     * 根据ID查询DstMemberUser
     * @param id
     * @return
     */
    @Override
    public DstMemberUser findById(Integer id){
        return  dstMemberUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询DstMemberUser全部数据
     * @return
     */
    @Override
    public List<DstMemberUser> findAll() {
        return dstMemberUserMapper.selectAll();
    }
}

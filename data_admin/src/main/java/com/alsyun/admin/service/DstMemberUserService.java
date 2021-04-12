package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstMemberUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstMemberUser业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstMemberUserService {

    /***
     * DstMemberUser多条件分页查询
     * @param dstMemberUser
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstMemberUser> findPage(DstMemberUser dstMemberUser, int page, int size);

    /***
     * DstMemberUser分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstMemberUser> findPage(int page, int size);

    /***
     * DstMemberUser多条件搜索方法
     * @param dstMemberUser
     * @return
     */
    List<DstMemberUser> findList(DstMemberUser dstMemberUser);

    /***
     * 删除DstMemberUser
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstMemberUser数据
     * @param dstMemberUser
     */
    void update(DstMemberUser dstMemberUser);

    /***
     * 新增DstMemberUser
     * @param dstMemberUser
     */
    void add(DstMemberUser dstMemberUser);

    /**
     * 根据ID查询DstMemberUser
     * @param id
     * @return
     */
     DstMemberUser findById(Integer id);

    /***
     * 查询所有DstMemberUser
     * @return
     */
    List<DstMemberUser> findAll();
}

package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstAccount;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstAccount业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstAccountService {

    /***
     * DstAccount多条件分页查询
     * @param dstAccount
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstAccount> findPage(DstAccount dstAccount, int page, int size);

    /***
     * DstAccount分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstAccount> findPage(int page, int size);

    /***
     * DstAccount多条件搜索方法
     * @param dstAccount
     * @return
     */
    List<DstAccount> findList(DstAccount dstAccount);

    /***
     * 删除DstAccount
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstAccount数据
     * @param dstAccount
     */
    void update(DstAccount dstAccount);

    /***
     * 新增DstAccount
     * @param dstAccount
     */
    void add(DstAccount dstAccount);

    /**
     * 根据ID查询DstAccount
     * @param id
     * @return
     */
     DstAccount findById(Integer id);

    /***
     * 查询所有DstAccount
     * @return
     */
    List<DstAccount> findAll();
}

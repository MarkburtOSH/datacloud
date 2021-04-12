package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstYzStore;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstYzStore业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstYzStoreService {

    /***
     * DstYzStore多条件分页查询
     * @param dstYzStore
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstYzStore> findPage(DstYzStore dstYzStore, int page, int size);

    /***
     * DstYzStore分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstYzStore> findPage(int page, int size);

    /***
     * DstYzStore多条件搜索方法
     * @param dstYzStore
     * @return
     */
    List<DstYzStore> findList(DstYzStore dstYzStore);

    /***
     * 删除DstYzStore
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstYzStore数据
     * @param dstYzStore
     */
    void update(DstYzStore dstYzStore);

    /***
     * 新增DstYzStore
     * @param dstYzStore
     */
    void add(DstYzStore dstYzStore);

    /**
     * 根据ID查询DstYzStore
     * @param id
     * @return
     */
     DstYzStore findById(Integer id);

    /***
     * 查询所有DstYzStore
     * @return
     */
    List<DstYzStore> findAll();
}

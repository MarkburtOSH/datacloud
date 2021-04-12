package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstReconciliation;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstReconciliation业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstReconciliationService {

    /***
     * DstReconciliation多条件分页查询
     * @param dstReconciliation
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstReconciliation> findPage(DstReconciliation dstReconciliation, int page, int size);

    /***
     * DstReconciliation分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstReconciliation> findPage(int page, int size);

    /***
     * DstReconciliation多条件搜索方法
     * @param dstReconciliation
     * @return
     */
    List<DstReconciliation> findList(DstReconciliation dstReconciliation);

    /***
     * 删除DstReconciliation
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstReconciliation数据
     * @param dstReconciliation
     */
    void update(DstReconciliation dstReconciliation);

    /***
     * 新增DstReconciliation
     * @param dstReconciliation
     */
    void add(DstReconciliation dstReconciliation);

    /**
     * 根据ID查询DstReconciliation
     * @param id
     * @return
     */
     DstReconciliation findById(Integer id);

    /***
     * 查询所有DstReconciliation
     * @return
     */
    List<DstReconciliation> findAll();
}

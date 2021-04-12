package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstCashInOut;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstCashInOut业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstCashInOutService {

    /***
     * DstCashInOut多条件分页查询
     * @param dstCashInOut
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstCashInOut> findPage(DstCashInOut dstCashInOut, int page, int size);

    /***
     * DstCashInOut分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstCashInOut> findPage(int page, int size);

    /***
     * DstCashInOut多条件搜索方法
     * @param dstCashInOut
     * @return
     */
    List<DstCashInOut> findList(DstCashInOut dstCashInOut);

    /***
     * 删除DstCashInOut
     * @param id
     */
    void delete(String id);

    /***
     * 修改DstCashInOut数据
     * @param dstCashInOut
     */
    void update(DstCashInOut dstCashInOut);

    /***
     * 新增DstCashInOut
     * @param dstCashInOut
     */
    void add(DstCashInOut dstCashInOut);

    /**
     * 根据ID查询DstCashInOut
     * @param id
     * @return
     */
     DstCashInOut findById(String id);

    /***
     * 查询所有DstCashInOut
     * @return
     */
    List<DstCashInOut> findAll();
}

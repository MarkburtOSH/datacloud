package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstAmountMan;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstAmountMan业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstAmountManService {

    /***
     * DstAmountMan多条件分页查询
     * @param dstAmountMan
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstAmountMan> findPage(DstAmountMan dstAmountMan, int page, int size);

    /***
     * DstAmountMan分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstAmountMan> findPage(int page, int size);

    /***
     * DstAmountMan多条件搜索方法
     * @param dstAmountMan
     * @return
     */
    List<DstAmountMan> findList(DstAmountMan dstAmountMan);

    /***
     * 删除DstAmountMan
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstAmountMan数据
     * @param dstAmountMan
     */
    void update(DstAmountMan dstAmountMan);

    /***
     * 新增DstAmountMan
     * @param dstAmountMan
     */
    void add(DstAmountMan dstAmountMan);

    /**
     * 根据ID查询DstAmountMan
     * @param id
     * @return
     */
     DstAmountMan findById(Integer id);

    /***
     * 查询所有DstAmountMan
     * @return
     */
    List<DstAmountMan> findAll();
}

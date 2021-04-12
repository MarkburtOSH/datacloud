package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstMoneySupervise;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstMoneySupervise业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstMoneySuperviseService {

    /***
     * DstMoneySupervise多条件分页查询
     * @param dstMoneySupervise
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstMoneySupervise> findPage(DstMoneySupervise dstMoneySupervise, int page, int size);

    /***
     * DstMoneySupervise分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstMoneySupervise> findPage(int page, int size);

    /***
     * DstMoneySupervise多条件搜索方法
     * @param dstMoneySupervise
     * @return
     */
    List<DstMoneySupervise> findList(DstMoneySupervise dstMoneySupervise);

    /***
     * 删除DstMoneySupervise
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstMoneySupervise数据
     * @param dstMoneySupervise
     */
    void update(DstMoneySupervise dstMoneySupervise);

    /***
     * 新增DstMoneySupervise
     * @param dstMoneySupervise
     */
    void add(DstMoneySupervise dstMoneySupervise);

    /**
     * 根据ID查询DstMoneySupervise
     * @param id
     * @return
     */
     DstMoneySupervise findById(Integer id);

    /***
     * 查询所有DstMoneySupervise
     * @return
     */
    List<DstMoneySupervise> findAll();
}

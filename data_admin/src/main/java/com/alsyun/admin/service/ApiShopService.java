package com.alsyun.admin.service;

import com.alsyun.admin.pojo.ApiShop;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:ApiShop业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface ApiShopService {

    /***
     * ApiShop多条件分页查询
     * @param apiShop
     * @param page
     * @param size
     * @return
     */
    PageInfo<ApiShop> findPage(ApiShop apiShop, int page, int size);

    /***
     * ApiShop分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<ApiShop> findPage(int page, int size);

    /***
     * ApiShop多条件搜索方法
     * @param apiShop
     * @return
     */
    List<ApiShop> findList(ApiShop apiShop);

    /***
     * 删除ApiShop
     * @param id
     */
    void delete(Long id);

    /***
     * 修改ApiShop数据
     * @param apiShop
     */
    void update(ApiShop apiShop);

    /***
     * 新增ApiShop
     * @param apiShop
     */
    void add(ApiShop apiShop);

    /**
     * 根据ID查询ApiShop
     * @param id
     * @return
     */
     ApiShop findById(Long id);

    /***
     * 查询所有ApiShop
     * @return
     */
    List<ApiShop> findAll();
}

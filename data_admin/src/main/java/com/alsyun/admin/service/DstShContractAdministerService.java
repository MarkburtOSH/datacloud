package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstShContractAdminister;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstShContractAdminister业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstShContractAdministerService {

    /***
     * DstShContractAdminister多条件分页查询
     * @param dstShContractAdminister
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstShContractAdminister> findPage(DstShContractAdminister dstShContractAdminister, int page, int size);

    /***
     * DstShContractAdminister分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstShContractAdminister> findPage(int page, int size);

    /***
     * DstShContractAdminister多条件搜索方法
     * @param dstShContractAdminister
     * @return
     */
    List<DstShContractAdminister> findList(DstShContractAdminister dstShContractAdminister);

    /***
     * 删除DstShContractAdminister
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstShContractAdminister数据
     * @param dstShContractAdminister
     */
    void update(DstShContractAdminister dstShContractAdminister);

    /***
     * 新增DstShContractAdminister
     * @param dstShContractAdminister
     */
    void add(DstShContractAdminister dstShContractAdminister);

    /**
     * 根据ID查询DstShContractAdminister
     * @param id
     * @return
     */
     DstShContractAdminister findById(Integer id);

    /***
     * 查询所有DstShContractAdminister
     * @return
     */
    List<DstShContractAdminister> findAll();
}

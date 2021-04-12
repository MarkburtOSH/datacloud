package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstNotification;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstNotification业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstNotificationService {

    /***
     * DstNotification多条件分页查询
     * @param dstNotification
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstNotification> findPage(DstNotification dstNotification, int page, int size);

    /***
     * DstNotification分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstNotification> findPage(int page, int size);

    /***
     * DstNotification多条件搜索方法
     * @param dstNotification
     * @return
     */
    List<DstNotification> findList(DstNotification dstNotification);

    /***
     * 删除DstNotification
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstNotification数据
     * @param dstNotification
     */
    void update(DstNotification dstNotification);

    /***
     * 新增DstNotification
     * @param dstNotification
     */
    void add(DstNotification dstNotification);

    /**
     * 根据ID查询DstNotification
     * @param id
     * @return
     */
     DstNotification findById(Integer id);

    /***
     * 查询所有DstNotification
     * @return
     */
    List<DstNotification> findAll();
}

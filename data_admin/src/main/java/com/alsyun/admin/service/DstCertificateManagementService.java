package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstCertificateManagement;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstCertificateManagement业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstCertificateManagementService {

    /***
     * DstCertificateManagement多条件分页查询
     * @param dstCertificateManagement
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstCertificateManagement> findPage(DstCertificateManagement dstCertificateManagement, int page, int size);

    /***
     * DstCertificateManagement分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstCertificateManagement> findPage(int page, int size);

    /***
     * DstCertificateManagement多条件搜索方法
     * @param dstCertificateManagement
     * @return
     */
    List<DstCertificateManagement> findList(DstCertificateManagement dstCertificateManagement);

    /***
     * 删除DstCertificateManagement
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstCertificateManagement数据
     * @param dstCertificateManagement
     */
    void update(DstCertificateManagement dstCertificateManagement);

    /***
     * 新增DstCertificateManagement
     * @param dstCertificateManagement
     */
    void add(DstCertificateManagement dstCertificateManagement);

    /**
     * 根据ID查询DstCertificateManagement
     * @param id
     * @return
     */
     DstCertificateManagement findById(Integer id);

    /***
     * 查询所有DstCertificateManagement
     * @return
     */
    List<DstCertificateManagement> findAll();
}

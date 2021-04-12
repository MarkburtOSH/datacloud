package com.alsyun.admin.service;

import com.alsyun.admin.pojo.GenTable;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:GenTable业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface GenTableService {

    /***
     * GenTable多条件分页查询
     * @param genTable
     * @param page
     * @param size
     * @return
     */
    PageInfo<GenTable> findPage(GenTable genTable, int page, int size);

    /***
     * GenTable分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<GenTable> findPage(int page, int size);

    /***
     * GenTable多条件搜索方法
     * @param genTable
     * @return
     */
    List<GenTable> findList(GenTable genTable);

    /***
     * 删除GenTable
     * @param id
     */
    void delete(Long id);

    /***
     * 修改GenTable数据
     * @param genTable
     */
    void update(GenTable genTable);

    /***
     * 新增GenTable
     * @param genTable
     */
    void add(GenTable genTable);

    /**
     * 根据ID查询GenTable
     * @param id
     * @return
     */
     GenTable findById(Long id);

    /***
     * 查询所有GenTable
     * @return
     */
    List<GenTable> findAll();
}

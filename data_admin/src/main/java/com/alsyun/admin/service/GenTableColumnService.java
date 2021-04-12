package com.alsyun.admin.service;

import com.alsyun.admin.pojo.GenTableColumn;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:GenTableColumn业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface GenTableColumnService {

    /***
     * GenTableColumn多条件分页查询
     * @param genTableColumn
     * @param page
     * @param size
     * @return
     */
    PageInfo<GenTableColumn> findPage(GenTableColumn genTableColumn, int page, int size);

    /***
     * GenTableColumn分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<GenTableColumn> findPage(int page, int size);

    /***
     * GenTableColumn多条件搜索方法
     * @param genTableColumn
     * @return
     */
    List<GenTableColumn> findList(GenTableColumn genTableColumn);

    /***
     * 删除GenTableColumn
     * @param id
     */
    void delete(Long id);

    /***
     * 修改GenTableColumn数据
     * @param genTableColumn
     */
    void update(GenTableColumn genTableColumn);

    /***
     * 新增GenTableColumn
     * @param genTableColumn
     */
    void add(GenTableColumn genTableColumn);

    /**
     * 根据ID查询GenTableColumn
     * @param id
     * @return
     */
     GenTableColumn findById(Long id);

    /***
     * 查询所有GenTableColumn
     * @return
     */
    List<GenTableColumn> findAll();
}

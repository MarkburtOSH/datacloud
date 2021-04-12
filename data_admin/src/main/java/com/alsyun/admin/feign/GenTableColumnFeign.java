package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.GenTableColumn;
import com.alsyun.entity.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:
 * @Date 2019/6/18 13:58
 *****/
@FeignClient(name="admin")
@RequestMapping("/genTableColumn")
public interface GenTableColumnFeign {

    /***
     * GenTableColumn分页条件搜索实现
     * @param genTableColumn
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) GenTableColumn genTableColumn, @PathVariable int page, @PathVariable  int size);

    /***
     * GenTableColumn分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param genTableColumn
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<GenTableColumn>> findList(@RequestBody(required = false) GenTableColumn genTableColumn);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Long id);

    /***
     * 修改GenTableColumn数据
     * @param genTableColumn
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody GenTableColumn genTableColumn,@PathVariable Long id);

    /***
     * 新增GenTableColumn数据
     * @param genTableColumn
     * @return
     */
    @PostMapping
    Result add(@RequestBody GenTableColumn genTableColumn);

    /***
     * 根据ID查询GenTableColumn数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<GenTableColumn> findById(@PathVariable Long id);

    /***
     * 查询GenTableColumn全部数据
     * @return
     */
    @GetMapping
    Result<List<GenTableColumn>> findAll();
}
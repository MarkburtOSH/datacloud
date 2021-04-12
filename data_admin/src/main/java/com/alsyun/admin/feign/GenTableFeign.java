package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.GenTable;
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
@RequestMapping("/genTable")
public interface GenTableFeign {

    /***
     * GenTable分页条件搜索实现
     * @param genTable
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) GenTable genTable, @PathVariable int page, @PathVariable  int size);

    /***
     * GenTable分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param genTable
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<GenTable>> findList(@RequestBody(required = false) GenTable genTable);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Long id);

    /***
     * 修改GenTable数据
     * @param genTable
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody GenTable genTable,@PathVariable Long id);

    /***
     * 新增GenTable数据
     * @param genTable
     * @return
     */
    @PostMapping
    Result add(@RequestBody GenTable genTable);

    /***
     * 根据ID查询GenTable数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<GenTable> findById(@PathVariable Long id);

    /***
     * 查询GenTable全部数据
     * @return
     */
    @GetMapping
    Result<List<GenTable>> findAll();
}
package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstYzStore;
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
@RequestMapping("/dstYzStore")
public interface DstYzStoreFeign {

    /***
     * DstYzStore分页条件搜索实现
     * @param dstYzStore
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstYzStore dstYzStore, @PathVariable  int page, @PathVariable  int size);

    /***
     * DstYzStore分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstYzStore
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstYzStore>> findList(@RequestBody(required = false) DstYzStore dstYzStore);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstYzStore数据
     * @param dstYzStore
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstYzStore dstYzStore,@PathVariable Integer id);

    /***
     * 新增DstYzStore数据
     * @param dstYzStore
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstYzStore dstYzStore);

    /***
     * 根据ID查询DstYzStore数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstYzStore> findById(@PathVariable Integer id);

    /***
     * 查询DstYzStore全部数据
     * @return
     */
    @GetMapping
    Result<List<DstYzStore>> findAll();
}
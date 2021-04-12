package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstReconciliation;
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
@RequestMapping("/dstReconciliation")
public interface DstReconciliationFeign {

    /***
     * DstReconciliation分页条件搜索实现
     * @param dstReconciliation
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstReconciliation dstReconciliation, @PathVariable int page, @PathVariable  int size);

    /***
     * DstReconciliation分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstReconciliation
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstReconciliation>> findList(@RequestBody(required = false) DstReconciliation dstReconciliation);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstReconciliation数据
     * @param dstReconciliation
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstReconciliation dstReconciliation,@PathVariable Integer id);

    /***
     * 新增DstReconciliation数据
     * @param dstReconciliation
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstReconciliation dstReconciliation);

    /***
     * 根据ID查询DstReconciliation数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstReconciliation> findById(@PathVariable Integer id);

    /***
     * 查询DstReconciliation全部数据
     * @return
     */
    @GetMapping
    Result<List<DstReconciliation>> findAll();
}
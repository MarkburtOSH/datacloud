package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstCashInOut;
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
@RequestMapping("/dstCashInOut")
public interface DstCashInOutFeign {

    /***
     * DstCashInOut分页条件搜索实现
     * @param dstCashInOut
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstCashInOut dstCashInOut, @PathVariable int page, @PathVariable  int size);

    /***
     * DstCashInOut分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstCashInOut
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstCashInOut>> findList(@RequestBody(required = false) DstCashInOut dstCashInOut);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable String id);

    /***
     * 修改DstCashInOut数据
     * @param dstCashInOut
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstCashInOut dstCashInOut,@PathVariable String id);

    /***
     * 新增DstCashInOut数据
     * @param dstCashInOut
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstCashInOut dstCashInOut);

    /***
     * 根据ID查询DstCashInOut数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstCashInOut> findById(@PathVariable String id);

    /***
     * 查询DstCashInOut全部数据
     * @return
     */
    @GetMapping
    Result<List<DstCashInOut>> findAll();
}
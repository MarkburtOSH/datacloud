package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstNotification;
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
@RequestMapping("/dstNotification")
public interface DstNotificationFeign {

    /***
     * DstNotification分页条件搜索实现
     * @param dstNotification
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstNotification dstNotification, @PathVariable int page, @PathVariable  int size);

    /***
     * DstNotification分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstNotification
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstNotification>> findList(@RequestBody(required = false) DstNotification dstNotification);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstNotification数据
     * @param dstNotification
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstNotification dstNotification,@PathVariable Integer id);

    /***
     * 新增DstNotification数据
     * @param dstNotification
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstNotification dstNotification);

    /***
     * 根据ID查询DstNotification数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstNotification> findById(@PathVariable Integer id);

    /***
     * 查询DstNotification全部数据
     * @return
     */
    @GetMapping
    Result<List<DstNotification>> findAll();
}
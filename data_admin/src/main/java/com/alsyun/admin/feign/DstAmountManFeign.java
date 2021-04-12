package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstAmountMan;
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
@RequestMapping("/dstAmountMan")
public interface DstAmountManFeign {

    /***
     * DstAmountMan分页条件搜索实现
     * @param dstAmountMan
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstAmountMan dstAmountMan, @PathVariable int page, @PathVariable  int size);

    /***
     * DstAmountMan分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstAmountMan
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstAmountMan>> findList(@RequestBody(required = false) DstAmountMan dstAmountMan);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstAmountMan数据
     * @param dstAmountMan
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstAmountMan dstAmountMan,@PathVariable Integer id);

    /***
     * 新增DstAmountMan数据
     * @param dstAmountMan
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstAmountMan dstAmountMan);

    /***
     * 根据ID查询DstAmountMan数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstAmountMan> findById(@PathVariable Integer id);

    /***
     * 查询DstAmountMan全部数据
     * @return
     */
    @GetMapping
    Result<List<DstAmountMan>> findAll();
}
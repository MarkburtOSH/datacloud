package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstMoneySupervise;
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
@RequestMapping("/dstMoneySupervise")
public interface DstMoneySuperviseFeign {

    /***
     * DstMoneySupervise分页条件搜索实现
     * @param dstMoneySupervise
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstMoneySupervise dstMoneySupervise, @PathVariable int page, @PathVariable  int size);

    /***
     * DstMoneySupervise分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstMoneySupervise
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstMoneySupervise>> findList(@RequestBody(required = false) DstMoneySupervise dstMoneySupervise);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstMoneySupervise数据
     * @param dstMoneySupervise
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstMoneySupervise dstMoneySupervise,@PathVariable Integer id);

    /***
     * 新增DstMoneySupervise数据
     * @param dstMoneySupervise
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstMoneySupervise dstMoneySupervise);

    /***
     * 根据ID查询DstMoneySupervise数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstMoneySupervise> findById(@PathVariable Integer id);

    /***
     * 查询DstMoneySupervise全部数据
     * @return
     */
    @GetMapping
    Result<List<DstMoneySupervise>> findAll();
}
package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstAccount;
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
@RequestMapping("/dstAccount")
public interface DstAccountFeign {

    /***
     * DstAccount分页条件搜索实现
     * @param dstAccount
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstAccount dstAccount, @PathVariable int page, @PathVariable  int size);

    /***
     * DstAccount分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstAccount
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstAccount>> findList(@RequestBody(required = false) DstAccount dstAccount);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstAccount数据
     * @param dstAccount
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstAccount dstAccount,@PathVariable Integer id);

    /***
     * 新增DstAccount数据
     * @param dstAccount
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstAccount dstAccount);

    /***
     * 根据ID查询DstAccount数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstAccount> findById(@PathVariable Integer id);

    /***
     * 查询DstAccount全部数据
     * @return
     */
    @GetMapping
    Result<List<DstAccount>> findAll();
}
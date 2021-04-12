package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.ApiShop;
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
@RequestMapping("/apiShop")
public interface ApiShopFeign {

    /***
     * ApiShop分页条件搜索实现
     * @param apiShop
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) ApiShop apiShop, @PathVariable int page, @PathVariable  int size);

    /***
     * ApiShop分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param apiShop
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<ApiShop>> findList(@RequestBody(required = false) ApiShop apiShop);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Long id);

    /***
     * 修改ApiShop数据
     * @param apiShop
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody ApiShop apiShop,@PathVariable Long id);

    /***
     * 新增ApiShop数据
     * @param apiShop
     * @return
     */
    @PostMapping
    Result add(@RequestBody ApiShop apiShop);

    /***
     * 根据ID查询ApiShop数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<ApiShop> findById(@PathVariable Long id);

    /***
     * 查询ApiShop全部数据
     * @return
     */
    @GetMapping
    Result<List<ApiShop>> findAll();
}
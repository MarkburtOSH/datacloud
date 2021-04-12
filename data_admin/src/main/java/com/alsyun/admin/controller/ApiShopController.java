package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.ApiShop;
import com.alsyun.admin.service.ApiShopService;
import com.github.pagehelper.PageInfo;
import com.alsyun.entity.Result;
import com.alsyun.entity.StatusCode;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:
 * @Date 2019/6/14 0:18
 *****/
@Api(value = "ApiShopController")
@RestController
@RequestMapping("/apiShop")
@CrossOrigin
public class ApiShopController {

    @Autowired
    private ApiShopService apiShopService;

    /***
     * ApiShop分页条件搜索实现
     * @param apiShop
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "ApiShop条件分页查询",notes = "分页条件查询ApiShop方法详情",tags = {"ApiShopController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "ApiShop对象",value = "传入JSON数据",required = false) ApiShop apiShop, @PathVariable  int page, @PathVariable  int size){
        //调用ApiShopService实现分页条件查询ApiShop
        PageInfo<ApiShop> pageInfo = apiShopService.findPage(apiShop, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * ApiShop分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "ApiShop分页查询",notes = "分页查询ApiShop方法详情",tags = {"ApiShopController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用ApiShopService实现分页查询ApiShop
        PageInfo<ApiShop> pageInfo = apiShopService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param apiShop
     * @return
     */
    @ApiOperation(value = "ApiShop条件查询",notes = "条件查询ApiShop方法详情",tags = {"ApiShopController"})
    @PostMapping(value = "/search" )
    public Result<List<ApiShop>> findList(@RequestBody(required = false) @ApiParam(name = "ApiShop对象",value = "传入JSON数据",required = false) ApiShop apiShop){
        //调用ApiShopService实现条件查询ApiShop
        List<ApiShop> list = apiShopService.findList(apiShop);
        return new Result<List<ApiShop>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "ApiShop根据ID删除",notes = "根据ID删除ApiShop方法详情",tags = {"ApiShopController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用ApiShopService实现根据主键删除
        apiShopService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改ApiShop数据
     * @param apiShop
     * @param id
     * @return
     */
    @ApiOperation(value = "ApiShop根据ID修改",notes = "根据ID修改ApiShop方法详情",tags = {"ApiShopController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "ApiShop对象",value = "传入JSON数据",required = false) ApiShop apiShop,@PathVariable Long id){
        //设置主键值
        apiShop.setId(id);
        //调用ApiShopService实现修改ApiShop
        apiShopService.update(apiShop);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增ApiShop数据
     * @param apiShop
     * @return
     */
    @ApiOperation(value = "ApiShop添加",notes = "添加ApiShop方法详情",tags = {"ApiShopController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "ApiShop对象",value = "传入JSON数据",required = true) ApiShop apiShop){
        //调用ApiShopService实现添加ApiShop
        apiShopService.add(apiShop);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询ApiShop数据
     * @param id
     * @return
     */
    @ApiOperation(value = "ApiShop根据ID查询",notes = "根据ID查询ApiShop方法详情",tags = {"ApiShopController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Result<ApiShop> findById(@PathVariable Long id){
        //调用ApiShopService实现根据主键查询ApiShop
        ApiShop apiShop = apiShopService.findById(id);
        return new Result<ApiShop>(true,StatusCode.OK,"查询成功",apiShop);
    }

    /***
     * 查询ApiShop全部数据
     * @return
     */
    @ApiOperation(value = "查询所有ApiShop",notes = "查询所ApiShop有方法详情",tags = {"ApiShopController"})
    @GetMapping
    public Result<List<ApiShop>> findAll(){
        //调用ApiShopService实现查询所有ApiShop
        List<ApiShop> list = apiShopService.findAll();
        return new Result<List<ApiShop>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

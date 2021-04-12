package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstYzStore;
import com.alsyun.admin.service.DstYzStoreService;
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
@Api(value = "DstYzStoreController")
@RestController
@RequestMapping("/dstYzStore")
@CrossOrigin
public class DstYzStoreController {

    @Autowired
    private DstYzStoreService dstYzStoreService;

    /***
     * DstYzStore分页条件搜索实现
     * @param dstYzStore
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstYzStore条件分页查询",notes = "分页条件查询DstYzStore方法详情",tags = {"DstYzStoreController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstYzStore对象",value = "传入JSON数据",required = false) DstYzStore dstYzStore, @PathVariable  int page, @PathVariable  int size){
        //调用DstYzStoreService实现分页条件查询DstYzStore
        PageInfo<DstYzStore> pageInfo = dstYzStoreService.findPage(dstYzStore, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstYzStore分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstYzStore分页查询",notes = "分页查询DstYzStore方法详情",tags = {"DstYzStoreController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstYzStoreService实现分页查询DstYzStore
        PageInfo<DstYzStore> pageInfo = dstYzStoreService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstYzStore
     * @return
     */
    @ApiOperation(value = "DstYzStore条件查询",notes = "条件查询DstYzStore方法详情",tags = {"DstYzStoreController"})
    @PostMapping(value = "/search" )
    public Result<List<DstYzStore>> findList(@RequestBody(required = false) @ApiParam(name = "DstYzStore对象",value = "传入JSON数据",required = false) DstYzStore dstYzStore){
        //调用DstYzStoreService实现条件查询DstYzStore
        List<DstYzStore> list = dstYzStoreService.findList(dstYzStore);
        return new Result<List<DstYzStore>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstYzStore根据ID删除",notes = "根据ID删除DstYzStore方法详情",tags = {"DstYzStoreController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstYzStoreService实现根据主键删除
        dstYzStoreService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstYzStore数据
     * @param dstYzStore
     * @param id
     * @return
     */
    @ApiOperation(value = "DstYzStore根据ID修改",notes = "根据ID修改DstYzStore方法详情",tags = {"DstYzStoreController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstYzStore对象",value = "传入JSON数据",required = false) DstYzStore dstYzStore,@PathVariable Integer id){
        //设置主键值
        dstYzStore.setId(id);
        //调用DstYzStoreService实现修改DstYzStore
        dstYzStoreService.update(dstYzStore);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstYzStore数据
     * @param dstYzStore
     * @return
     */
    @ApiOperation(value = "DstYzStore添加",notes = "添加DstYzStore方法详情",tags = {"DstYzStoreController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstYzStore对象",value = "传入JSON数据",required = true) DstYzStore dstYzStore){
        //调用DstYzStoreService实现添加DstYzStore
        dstYzStoreService.add(dstYzStore);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstYzStore数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstYzStore根据ID查询",notes = "根据ID查询DstYzStore方法详情",tags = {"DstYzStoreController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstYzStore> findById(@PathVariable Integer id){
        //调用DstYzStoreService实现根据主键查询DstYzStore
        DstYzStore dstYzStore = dstYzStoreService.findById(id);
        return new Result<DstYzStore>(true,StatusCode.OK,"查询成功",dstYzStore);
    }

    /***
     * 查询DstYzStore全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstYzStore",notes = "查询所DstYzStore有方法详情",tags = {"DstYzStoreController"})
    @GetMapping
    public Result<List<DstYzStore>> findAll(){
        //调用DstYzStoreService实现查询所有DstYzStore
        List<DstYzStore> list = dstYzStoreService.findAll();
        return new Result<List<DstYzStore>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

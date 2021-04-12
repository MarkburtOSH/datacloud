package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstShContractAdminister;
import com.alsyun.admin.service.DstShContractAdministerService;
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
@Api(value = "DstShContractAdministerController")
@RestController
@RequestMapping("/dstShContractAdminister")
@CrossOrigin
public class DstShContractAdministerController {

    @Autowired
    private DstShContractAdministerService dstShContractAdministerService;

    /***
     * DstShContractAdminister分页条件搜索实现
     * @param dstShContractAdminister
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister条件分页查询",notes = "分页条件查询DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstShContractAdminister对象",value = "传入JSON数据",required = false) DstShContractAdminister dstShContractAdminister, @PathVariable  int page, @PathVariable  int size){
        //调用DstShContractAdministerService实现分页条件查询DstShContractAdminister
        PageInfo<DstShContractAdminister> pageInfo = dstShContractAdministerService.findPage(dstShContractAdminister, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstShContractAdminister分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister分页查询",notes = "分页查询DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstShContractAdministerService实现分页查询DstShContractAdminister
        PageInfo<DstShContractAdminister> pageInfo = dstShContractAdministerService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstShContractAdminister
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister条件查询",notes = "条件查询DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @PostMapping(value = "/search" )
    public Result<List<DstShContractAdminister>> findList(@RequestBody(required = false) @ApiParam(name = "DstShContractAdminister对象",value = "传入JSON数据",required = false) DstShContractAdminister dstShContractAdminister){
        //调用DstShContractAdministerService实现条件查询DstShContractAdminister
        List<DstShContractAdminister> list = dstShContractAdministerService.findList(dstShContractAdminister);
        return new Result<List<DstShContractAdminister>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister根据ID删除",notes = "根据ID删除DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstShContractAdministerService实现根据主键删除
        dstShContractAdministerService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstShContractAdminister数据
     * @param dstShContractAdminister
     * @param id
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister根据ID修改",notes = "根据ID修改DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstShContractAdminister对象",value = "传入JSON数据",required = false) DstShContractAdminister dstShContractAdminister,@PathVariable Integer id){
        //设置主键值
        dstShContractAdminister.setId(id);
        //调用DstShContractAdministerService实现修改DstShContractAdminister
        dstShContractAdministerService.update(dstShContractAdminister);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstShContractAdminister数据
     * @param dstShContractAdminister
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister添加",notes = "添加DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstShContractAdminister对象",value = "传入JSON数据",required = true) DstShContractAdminister dstShContractAdminister){
        //调用DstShContractAdministerService实现添加DstShContractAdminister
        dstShContractAdministerService.add(dstShContractAdminister);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstShContractAdminister数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstShContractAdminister根据ID查询",notes = "根据ID查询DstShContractAdminister方法详情",tags = {"DstShContractAdministerController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstShContractAdminister> findById(@PathVariable Integer id){
        //调用DstShContractAdministerService实现根据主键查询DstShContractAdminister
        DstShContractAdminister dstShContractAdminister = dstShContractAdministerService.findById(id);
        return new Result<DstShContractAdminister>(true,StatusCode.OK,"查询成功",dstShContractAdminister);
    }

    /***
     * 查询DstShContractAdminister全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstShContractAdminister",notes = "查询所DstShContractAdminister有方法详情",tags = {"DstShContractAdministerController"})
    @GetMapping
    public Result<List<DstShContractAdminister>> findAll(){
        //调用DstShContractAdministerService实现查询所有DstShContractAdminister
        List<DstShContractAdminister> list = dstShContractAdministerService.findAll();
        return new Result<List<DstShContractAdminister>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

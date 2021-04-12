package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstReconciliation;
import com.alsyun.admin.service.DstReconciliationService;
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
@Api(value = "DstReconciliationController")
@RestController
@RequestMapping("/dstReconciliation")
@CrossOrigin
public class DstReconciliationController {

    @Autowired
    private DstReconciliationService dstReconciliationService;

    /***
     * DstReconciliation分页条件搜索实现
     * @param dstReconciliation
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstReconciliation条件分页查询",notes = "分页条件查询DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstReconciliation对象",value = "传入JSON数据",required = false) DstReconciliation dstReconciliation, @PathVariable  int page, @PathVariable  int size){
        //调用DstReconciliationService实现分页条件查询DstReconciliation
        PageInfo<DstReconciliation> pageInfo = dstReconciliationService.findPage(dstReconciliation, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstReconciliation分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstReconciliation分页查询",notes = "分页查询DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstReconciliationService实现分页查询DstReconciliation
        PageInfo<DstReconciliation> pageInfo = dstReconciliationService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstReconciliation
     * @return
     */
    @ApiOperation(value = "DstReconciliation条件查询",notes = "条件查询DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @PostMapping(value = "/search" )
    public Result<List<DstReconciliation>> findList(@RequestBody(required = false) @ApiParam(name = "DstReconciliation对象",value = "传入JSON数据",required = false) DstReconciliation dstReconciliation){
        //调用DstReconciliationService实现条件查询DstReconciliation
        List<DstReconciliation> list = dstReconciliationService.findList(dstReconciliation);
        return new Result<List<DstReconciliation>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstReconciliation根据ID删除",notes = "根据ID删除DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstReconciliationService实现根据主键删除
        dstReconciliationService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstReconciliation数据
     * @param dstReconciliation
     * @param id
     * @return
     */
    @ApiOperation(value = "DstReconciliation根据ID修改",notes = "根据ID修改DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstReconciliation对象",value = "传入JSON数据",required = false) DstReconciliation dstReconciliation,@PathVariable Integer id){
        //设置主键值
        dstReconciliation.setId(id);
        //调用DstReconciliationService实现修改DstReconciliation
        dstReconciliationService.update(dstReconciliation);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstReconciliation数据
     * @param dstReconciliation
     * @return
     */
    @ApiOperation(value = "DstReconciliation添加",notes = "添加DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstReconciliation对象",value = "传入JSON数据",required = true) DstReconciliation dstReconciliation){
        //调用DstReconciliationService实现添加DstReconciliation
        dstReconciliationService.add(dstReconciliation);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstReconciliation数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstReconciliation根据ID查询",notes = "根据ID查询DstReconciliation方法详情",tags = {"DstReconciliationController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstReconciliation> findById(@PathVariable Integer id){
        //调用DstReconciliationService实现根据主键查询DstReconciliation
        DstReconciliation dstReconciliation = dstReconciliationService.findById(id);
        return new Result<DstReconciliation>(true,StatusCode.OK,"查询成功",dstReconciliation);
    }

    /***
     * 查询DstReconciliation全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstReconciliation",notes = "查询所DstReconciliation有方法详情",tags = {"DstReconciliationController"})
    @GetMapping
    public Result<List<DstReconciliation>> findAll(){
        //调用DstReconciliationService实现查询所有DstReconciliation
        List<DstReconciliation> list = dstReconciliationService.findAll();
        return new Result<List<DstReconciliation>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

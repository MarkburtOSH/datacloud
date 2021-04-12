package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstCashInOut;
import com.alsyun.admin.service.DstCashInOutService;
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
@Api(value = "DstCashInOutController")
@RestController
@RequestMapping("/dstCashInOut")
@CrossOrigin
public class DstCashInOutController {

    @Autowired
    private DstCashInOutService dstCashInOutService;

    /***
     * DstCashInOut分页条件搜索实现
     * @param dstCashInOut
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstCashInOut条件分页查询",notes = "分页条件查询DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstCashInOut对象",value = "传入JSON数据",required = false) DstCashInOut dstCashInOut, @PathVariable  int page, @PathVariable  int size){
        //调用DstCashInOutService实现分页条件查询DstCashInOut
        PageInfo<DstCashInOut> pageInfo = dstCashInOutService.findPage(dstCashInOut, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstCashInOut分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstCashInOut分页查询",notes = "分页查询DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstCashInOutService实现分页查询DstCashInOut
        PageInfo<DstCashInOut> pageInfo = dstCashInOutService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstCashInOut
     * @return
     */
    @ApiOperation(value = "DstCashInOut条件查询",notes = "条件查询DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @PostMapping(value = "/search" )
    public Result<List<DstCashInOut>> findList(@RequestBody(required = false) @ApiParam(name = "DstCashInOut对象",value = "传入JSON数据",required = false) DstCashInOut dstCashInOut){
        //调用DstCashInOutService实现条件查询DstCashInOut
        List<DstCashInOut> list = dstCashInOutService.findList(dstCashInOut);
        return new Result<List<DstCashInOut>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstCashInOut根据ID删除",notes = "根据ID删除DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "String")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable String id){
        //调用DstCashInOutService实现根据主键删除
        dstCashInOutService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstCashInOut数据
     * @param dstCashInOut
     * @param id
     * @return
     */
    @ApiOperation(value = "DstCashInOut根据ID修改",notes = "根据ID修改DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "String")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstCashInOut对象",value = "传入JSON数据",required = false) DstCashInOut dstCashInOut,@PathVariable String id){
        //设置主键值
        dstCashInOut.setOddNumbers(id);
        //调用DstCashInOutService实现修改DstCashInOut
        dstCashInOutService.update(dstCashInOut);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstCashInOut数据
     * @param dstCashInOut
     * @return
     */
    @ApiOperation(value = "DstCashInOut添加",notes = "添加DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstCashInOut对象",value = "传入JSON数据",required = true) DstCashInOut dstCashInOut){
        //调用DstCashInOutService实现添加DstCashInOut
        dstCashInOutService.add(dstCashInOut);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstCashInOut数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstCashInOut根据ID查询",notes = "根据ID查询DstCashInOut方法详情",tags = {"DstCashInOutController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "String")
    @GetMapping("/{id}")
    public Result<DstCashInOut> findById(@PathVariable String id){
        //调用DstCashInOutService实现根据主键查询DstCashInOut
        DstCashInOut dstCashInOut = dstCashInOutService.findById(id);
        return new Result<DstCashInOut>(true,StatusCode.OK,"查询成功",dstCashInOut);
    }

    /***
     * 查询DstCashInOut全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstCashInOut",notes = "查询所DstCashInOut有方法详情",tags = {"DstCashInOutController"})
    @GetMapping
    public Result<List<DstCashInOut>> findAll(){
        //调用DstCashInOutService实现查询所有DstCashInOut
        List<DstCashInOut> list = dstCashInOutService.findAll();
        return new Result<List<DstCashInOut>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

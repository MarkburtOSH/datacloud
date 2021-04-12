package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstNotification;
import com.alsyun.admin.service.DstNotificationService;
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
@Api(value = "DstNotificationController")
@RestController
@RequestMapping("/dstNotification")
@CrossOrigin
public class DstNotificationController {

    @Autowired
    private DstNotificationService dstNotificationService;

    /***
     * DstNotification分页条件搜索实现
     * @param dstNotification
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstNotification条件分页查询",notes = "分页条件查询DstNotification方法详情",tags = {"DstNotificationController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstNotification对象",value = "传入JSON数据",required = false) DstNotification dstNotification, @PathVariable  int page, @PathVariable  int size){
        //调用DstNotificationService实现分页条件查询DstNotification
        PageInfo<DstNotification> pageInfo = dstNotificationService.findPage(dstNotification, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstNotification分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstNotification分页查询",notes = "分页查询DstNotification方法详情",tags = {"DstNotificationController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstNotificationService实现分页查询DstNotification
        PageInfo<DstNotification> pageInfo = dstNotificationService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstNotification
     * @return
     */
    @ApiOperation(value = "DstNotification条件查询",notes = "条件查询DstNotification方法详情",tags = {"DstNotificationController"})
    @PostMapping(value = "/search" )
    public Result<List<DstNotification>> findList(@RequestBody(required = false) @ApiParam(name = "DstNotification对象",value = "传入JSON数据",required = false) DstNotification dstNotification){
        //调用DstNotificationService实现条件查询DstNotification
        List<DstNotification> list = dstNotificationService.findList(dstNotification);
        return new Result<List<DstNotification>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstNotification根据ID删除",notes = "根据ID删除DstNotification方法详情",tags = {"DstNotificationController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstNotificationService实现根据主键删除
        dstNotificationService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstNotification数据
     * @param dstNotification
     * @param id
     * @return
     */
    @ApiOperation(value = "DstNotification根据ID修改",notes = "根据ID修改DstNotification方法详情",tags = {"DstNotificationController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstNotification对象",value = "传入JSON数据",required = false) DstNotification dstNotification,@PathVariable Integer id){
        //设置主键值
        dstNotification.setId(id);
        //调用DstNotificationService实现修改DstNotification
        dstNotificationService.update(dstNotification);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstNotification数据
     * @param dstNotification
     * @return
     */
    @ApiOperation(value = "DstNotification添加",notes = "添加DstNotification方法详情",tags = {"DstNotificationController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstNotification对象",value = "传入JSON数据",required = true) DstNotification dstNotification){
        //调用DstNotificationService实现添加DstNotification
        dstNotificationService.add(dstNotification);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstNotification数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstNotification根据ID查询",notes = "根据ID查询DstNotification方法详情",tags = {"DstNotificationController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstNotification> findById(@PathVariable Integer id){
        //调用DstNotificationService实现根据主键查询DstNotification
        DstNotification dstNotification = dstNotificationService.findById(id);
        return new Result<DstNotification>(true,StatusCode.OK,"查询成功",dstNotification);
    }

    /***
     * 查询DstNotification全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstNotification",notes = "查询所DstNotification有方法详情",tags = {"DstNotificationController"})
    @GetMapping
    public Result<List<DstNotification>> findAll(){
        //调用DstNotificationService实现查询所有DstNotification
        List<DstNotification> list = dstNotificationService.findAll();
        return new Result<List<DstNotification>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

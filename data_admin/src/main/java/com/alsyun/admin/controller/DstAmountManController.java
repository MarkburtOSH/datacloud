package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstAmountMan;
import com.alsyun.admin.service.DstAmountManService;
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
@Api(value = "DstAmountManController")
@RestController
@RequestMapping("/dstAmountMan")
@CrossOrigin
public class DstAmountManController {

    @Autowired
    private DstAmountManService dstAmountManService;

    /***
     * DstAmountMan分页条件搜索实现
     * @param dstAmountMan
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstAmountMan条件分页查询",notes = "分页条件查询DstAmountMan方法详情",tags = {"DstAmountManController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstAmountMan对象",value = "传入JSON数据",required = false) DstAmountMan dstAmountMan, @PathVariable  int page, @PathVariable  int size){
        //调用DstAmountManService实现分页条件查询DstAmountMan
        PageInfo<DstAmountMan> pageInfo = dstAmountManService.findPage(dstAmountMan, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstAmountMan分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstAmountMan分页查询",notes = "分页查询DstAmountMan方法详情",tags = {"DstAmountManController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstAmountManService实现分页查询DstAmountMan
        PageInfo<DstAmountMan> pageInfo = dstAmountManService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstAmountMan
     * @return
     */
    @ApiOperation(value = "DstAmountMan条件查询",notes = "条件查询DstAmountMan方法详情",tags = {"DstAmountManController"})
    @PostMapping(value = "/search" )
    public Result<List<DstAmountMan>> findList(@RequestBody(required = false) @ApiParam(name = "DstAmountMan对象",value = "传入JSON数据",required = false) DstAmountMan dstAmountMan){
        //调用DstAmountManService实现条件查询DstAmountMan
        List<DstAmountMan> list = dstAmountManService.findList(dstAmountMan);
        return new Result<List<DstAmountMan>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstAmountMan根据ID删除",notes = "根据ID删除DstAmountMan方法详情",tags = {"DstAmountManController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstAmountManService实现根据主键删除
        dstAmountManService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstAmountMan数据
     * @param dstAmountMan
     * @param id
     * @return
     */
    @ApiOperation(value = "DstAmountMan根据ID修改",notes = "根据ID修改DstAmountMan方法详情",tags = {"DstAmountManController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstAmountMan对象",value = "传入JSON数据",required = false) DstAmountMan dstAmountMan,@PathVariable Integer id){
        //设置主键值
        dstAmountMan.setId(id);
        //调用DstAmountManService实现修改DstAmountMan
        dstAmountManService.update(dstAmountMan);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstAmountMan数据
     * @param dstAmountMan
     * @return
     */
    @ApiOperation(value = "DstAmountMan添加",notes = "添加DstAmountMan方法详情",tags = {"DstAmountManController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstAmountMan对象",value = "传入JSON数据",required = true) DstAmountMan dstAmountMan){
        //调用DstAmountManService实现添加DstAmountMan
        dstAmountManService.add(dstAmountMan);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstAmountMan数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstAmountMan根据ID查询",notes = "根据ID查询DstAmountMan方法详情",tags = {"DstAmountManController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstAmountMan> findById(@PathVariable Integer id){
        //调用DstAmountManService实现根据主键查询DstAmountMan
        DstAmountMan dstAmountMan = dstAmountManService.findById(id);
        return new Result<DstAmountMan>(true,StatusCode.OK,"查询成功",dstAmountMan);
    }

    /***
     * 查询DstAmountMan全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstAmountMan",notes = "查询所DstAmountMan有方法详情",tags = {"DstAmountManController"})
    @GetMapping
    public Result<List<DstAmountMan>> findAll(){
        //调用DstAmountManService实现查询所有DstAmountMan
        List<DstAmountMan> list = dstAmountManService.findAll();
        return new Result<List<DstAmountMan>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

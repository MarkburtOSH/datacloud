package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.GenTableColumn;
import com.alsyun.admin.service.GenTableColumnService;
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
@Api(value = "GenTableColumnController")
@RestController
@RequestMapping("/genTableColumn")
@CrossOrigin
public class GenTableColumnController {

    @Autowired
    private GenTableColumnService genTableColumnService;

    /***
     * GenTableColumn分页条件搜索实现
     * @param genTableColumn
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "GenTableColumn条件分页查询",notes = "分页条件查询GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "GenTableColumn对象",value = "传入JSON数据",required = false) GenTableColumn genTableColumn, @PathVariable  int page, @PathVariable  int size){
        //调用GenTableColumnService实现分页条件查询GenTableColumn
        PageInfo<GenTableColumn> pageInfo = genTableColumnService.findPage(genTableColumn, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * GenTableColumn分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "GenTableColumn分页查询",notes = "分页查询GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用GenTableColumnService实现分页查询GenTableColumn
        PageInfo<GenTableColumn> pageInfo = genTableColumnService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param genTableColumn
     * @return
     */
    @ApiOperation(value = "GenTableColumn条件查询",notes = "条件查询GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @PostMapping(value = "/search" )
    public Result<List<GenTableColumn>> findList(@RequestBody(required = false) @ApiParam(name = "GenTableColumn对象",value = "传入JSON数据",required = false) GenTableColumn genTableColumn){
        //调用GenTableColumnService实现条件查询GenTableColumn
        List<GenTableColumn> list = genTableColumnService.findList(genTableColumn);
        return new Result<List<GenTableColumn>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "GenTableColumn根据ID删除",notes = "根据ID删除GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用GenTableColumnService实现根据主键删除
        genTableColumnService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改GenTableColumn数据
     * @param genTableColumn
     * @param id
     * @return
     */
    @ApiOperation(value = "GenTableColumn根据ID修改",notes = "根据ID修改GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "GenTableColumn对象",value = "传入JSON数据",required = false) GenTableColumn genTableColumn,@PathVariable Long id){
        //设置主键值
        genTableColumn.setColumnId(id);
        //调用GenTableColumnService实现修改GenTableColumn
        genTableColumnService.update(genTableColumn);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增GenTableColumn数据
     * @param genTableColumn
     * @return
     */
    @ApiOperation(value = "GenTableColumn添加",notes = "添加GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "GenTableColumn对象",value = "传入JSON数据",required = true) GenTableColumn genTableColumn){
        //调用GenTableColumnService实现添加GenTableColumn
        genTableColumnService.add(genTableColumn);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询GenTableColumn数据
     * @param id
     * @return
     */
    @ApiOperation(value = "GenTableColumn根据ID查询",notes = "根据ID查询GenTableColumn方法详情",tags = {"GenTableColumnController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Result<GenTableColumn> findById(@PathVariable Long id){
        //调用GenTableColumnService实现根据主键查询GenTableColumn
        GenTableColumn genTableColumn = genTableColumnService.findById(id);
        return new Result<GenTableColumn>(true,StatusCode.OK,"查询成功",genTableColumn);
    }

    /***
     * 查询GenTableColumn全部数据
     * @return
     */
    @ApiOperation(value = "查询所有GenTableColumn",notes = "查询所GenTableColumn有方法详情",tags = {"GenTableColumnController"})
    @GetMapping
    public Result<List<GenTableColumn>> findAll(){
        //调用GenTableColumnService实现查询所有GenTableColumn
        List<GenTableColumn> list = genTableColumnService.findAll();
        return new Result<List<GenTableColumn>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

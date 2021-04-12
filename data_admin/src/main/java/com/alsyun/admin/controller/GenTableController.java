package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.GenTable;
import com.alsyun.admin.service.GenTableService;
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
@Api(value = "GenTableController")
@RestController
@RequestMapping("/genTable")
@CrossOrigin
public class GenTableController {

    @Autowired
    private GenTableService genTableService;

    /***
     * GenTable分页条件搜索实现
     * @param genTable
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "GenTable条件分页查询",notes = "分页条件查询GenTable方法详情",tags = {"GenTableController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "GenTable对象",value = "传入JSON数据",required = false) GenTable genTable, @PathVariable  int page, @PathVariable  int size){
        //调用GenTableService实现分页条件查询GenTable
        PageInfo<GenTable> pageInfo = genTableService.findPage(genTable, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * GenTable分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "GenTable分页查询",notes = "分页查询GenTable方法详情",tags = {"GenTableController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用GenTableService实现分页查询GenTable
        PageInfo<GenTable> pageInfo = genTableService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param genTable
     * @return
     */
    @ApiOperation(value = "GenTable条件查询",notes = "条件查询GenTable方法详情",tags = {"GenTableController"})
    @PostMapping(value = "/search" )
    public Result<List<GenTable>> findList(@RequestBody(required = false) @ApiParam(name = "GenTable对象",value = "传入JSON数据",required = false) GenTable genTable){
        //调用GenTableService实现条件查询GenTable
        List<GenTable> list = genTableService.findList(genTable);
        return new Result<List<GenTable>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "GenTable根据ID删除",notes = "根据ID删除GenTable方法详情",tags = {"GenTableController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        //调用GenTableService实现根据主键删除
        genTableService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改GenTable数据
     * @param genTable
     * @param id
     * @return
     */
    @ApiOperation(value = "GenTable根据ID修改",notes = "根据ID修改GenTable方法详情",tags = {"GenTableController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "GenTable对象",value = "传入JSON数据",required = false) GenTable genTable,@PathVariable Long id){
        //设置主键值
        genTable.setTableId(id);
        //调用GenTableService实现修改GenTable
        genTableService.update(genTable);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增GenTable数据
     * @param genTable
     * @return
     */
    @ApiOperation(value = "GenTable添加",notes = "添加GenTable方法详情",tags = {"GenTableController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "GenTable对象",value = "传入JSON数据",required = true) GenTable genTable){
        //调用GenTableService实现添加GenTable
        genTableService.add(genTable);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询GenTable数据
     * @param id
     * @return
     */
    @ApiOperation(value = "GenTable根据ID查询",notes = "根据ID查询GenTable方法详情",tags = {"GenTableController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Result<GenTable> findById(@PathVariable Long id){
        //调用GenTableService实现根据主键查询GenTable
        GenTable genTable = genTableService.findById(id);
        return new Result<GenTable>(true,StatusCode.OK,"查询成功",genTable);
    }

    /***
     * 查询GenTable全部数据
     * @return
     */
    @ApiOperation(value = "查询所有GenTable",notes = "查询所GenTable有方法详情",tags = {"GenTableController"})
    @GetMapping
    public Result<List<GenTable>> findAll(){
        //调用GenTableService实现查询所有GenTable
        List<GenTable> list = genTableService.findAll();
        return new Result<List<GenTable>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

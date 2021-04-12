package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstMoneySupervise;
import com.alsyun.admin.service.DstMoneySuperviseService;
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
@Api(value = "DstMoneySuperviseController")
@RestController
@RequestMapping("/dstMoneySupervise")
@CrossOrigin
public class DstMoneySuperviseController {

    @Autowired
    private DstMoneySuperviseService dstMoneySuperviseService;

    /***
     * DstMoneySupervise分页条件搜索实现
     * @param dstMoneySupervise
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise条件分页查询",notes = "分页条件查询DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstMoneySupervise对象",value = "传入JSON数据",required = false) DstMoneySupervise dstMoneySupervise, @PathVariable  int page, @PathVariable  int size){
        //调用DstMoneySuperviseService实现分页条件查询DstMoneySupervise
        PageInfo<DstMoneySupervise> pageInfo = dstMoneySuperviseService.findPage(dstMoneySupervise, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstMoneySupervise分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise分页查询",notes = "分页查询DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstMoneySuperviseService实现分页查询DstMoneySupervise
        PageInfo<DstMoneySupervise> pageInfo = dstMoneySuperviseService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstMoneySupervise
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise条件查询",notes = "条件查询DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @PostMapping(value = "/search" )
    public Result<List<DstMoneySupervise>> findList(@RequestBody(required = false) @ApiParam(name = "DstMoneySupervise对象",value = "传入JSON数据",required = false) DstMoneySupervise dstMoneySupervise){
        //调用DstMoneySuperviseService实现条件查询DstMoneySupervise
        List<DstMoneySupervise> list = dstMoneySuperviseService.findList(dstMoneySupervise);
        return new Result<List<DstMoneySupervise>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise根据ID删除",notes = "根据ID删除DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstMoneySuperviseService实现根据主键删除
        dstMoneySuperviseService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstMoneySupervise数据
     * @param dstMoneySupervise
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise根据ID修改",notes = "根据ID修改DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstMoneySupervise对象",value = "传入JSON数据",required = false) DstMoneySupervise dstMoneySupervise,@PathVariable Integer id){
        //设置主键值
        dstMoneySupervise.setId(id);
        //调用DstMoneySuperviseService实现修改DstMoneySupervise
        dstMoneySuperviseService.update(dstMoneySupervise);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstMoneySupervise数据
     * @param dstMoneySupervise
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise添加",notes = "添加DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstMoneySupervise对象",value = "传入JSON数据",required = true) DstMoneySupervise dstMoneySupervise){
        //调用DstMoneySuperviseService实现添加DstMoneySupervise
        dstMoneySuperviseService.add(dstMoneySupervise);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstMoneySupervise数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMoneySupervise根据ID查询",notes = "根据ID查询DstMoneySupervise方法详情",tags = {"DstMoneySuperviseController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstMoneySupervise> findById(@PathVariable Integer id){
        //调用DstMoneySuperviseService实现根据主键查询DstMoneySupervise
        DstMoneySupervise dstMoneySupervise = dstMoneySuperviseService.findById(id);
        return new Result<DstMoneySupervise>(true,StatusCode.OK,"查询成功",dstMoneySupervise);
    }

    /***
     * 查询DstMoneySupervise全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstMoneySupervise",notes = "查询所DstMoneySupervise有方法详情",tags = {"DstMoneySuperviseController"})
    @GetMapping
    public Result<List<DstMoneySupervise>> findAll(){
        //调用DstMoneySuperviseService实现查询所有DstMoneySupervise
        List<DstMoneySupervise> list = dstMoneySuperviseService.findAll();
        return new Result<List<DstMoneySupervise>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

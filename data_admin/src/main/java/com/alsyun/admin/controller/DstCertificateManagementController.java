package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstCertificateManagement;
import com.alsyun.admin.service.DstCertificateManagementService;
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
@Api(value = "DstCertificateManagementController")
@RestController
@RequestMapping("/dstCertificateManagement")
@CrossOrigin
public class DstCertificateManagementController {

    @Autowired
    private DstCertificateManagementService dstCertificateManagementService;

    /***
     * DstCertificateManagement分页条件搜索实现
     * @param dstCertificateManagement
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement条件分页查询",notes = "分页条件查询DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstCertificateManagement对象",value = "传入JSON数据",required = false) DstCertificateManagement dstCertificateManagement, @PathVariable  int page, @PathVariable  int size){
        //调用DstCertificateManagementService实现分页条件查询DstCertificateManagement
        PageInfo<DstCertificateManagement> pageInfo = dstCertificateManagementService.findPage(dstCertificateManagement, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstCertificateManagement分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement分页查询",notes = "分页查询DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstCertificateManagementService实现分页查询DstCertificateManagement
        PageInfo<DstCertificateManagement> pageInfo = dstCertificateManagementService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstCertificateManagement
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement条件查询",notes = "条件查询DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @PostMapping(value = "/search" )
    public Result<List<DstCertificateManagement>> findList(@RequestBody(required = false) @ApiParam(name = "DstCertificateManagement对象",value = "传入JSON数据",required = false) DstCertificateManagement dstCertificateManagement){
        //调用DstCertificateManagementService实现条件查询DstCertificateManagement
        List<DstCertificateManagement> list = dstCertificateManagementService.findList(dstCertificateManagement);
        return new Result<List<DstCertificateManagement>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement根据ID删除",notes = "根据ID删除DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstCertificateManagementService实现根据主键删除
        dstCertificateManagementService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstCertificateManagement数据
     * @param dstCertificateManagement
     * @param id
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement根据ID修改",notes = "根据ID修改DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstCertificateManagement对象",value = "传入JSON数据",required = false) DstCertificateManagement dstCertificateManagement,@PathVariable Integer id){
        //设置主键值
        dstCertificateManagement.setId(id);
        //调用DstCertificateManagementService实现修改DstCertificateManagement
        dstCertificateManagementService.update(dstCertificateManagement);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstCertificateManagement数据
     * @param dstCertificateManagement
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement添加",notes = "添加DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstCertificateManagement对象",value = "传入JSON数据",required = true) DstCertificateManagement dstCertificateManagement){
        //调用DstCertificateManagementService实现添加DstCertificateManagement
        dstCertificateManagementService.add(dstCertificateManagement);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstCertificateManagement数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstCertificateManagement根据ID查询",notes = "根据ID查询DstCertificateManagement方法详情",tags = {"DstCertificateManagementController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstCertificateManagement> findById(@PathVariable Integer id){
        //调用DstCertificateManagementService实现根据主键查询DstCertificateManagement
        DstCertificateManagement dstCertificateManagement = dstCertificateManagementService.findById(id);
        return new Result<DstCertificateManagement>(true,StatusCode.OK,"查询成功",dstCertificateManagement);
    }

    /***
     * 查询DstCertificateManagement全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstCertificateManagement",notes = "查询所DstCertificateManagement有方法详情",tags = {"DstCertificateManagementController"})
    @GetMapping
    public Result<List<DstCertificateManagement>> findAll(){
        //调用DstCertificateManagementService实现查询所有DstCertificateManagement
        List<DstCertificateManagement> list = dstCertificateManagementService.findAll();
        return new Result<List<DstCertificateManagement>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

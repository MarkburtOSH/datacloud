package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstAccount;
import com.alsyun.admin.service.DstAccountService;

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
@Api(value = "DstAccountController")
@RestController
@RequestMapping("/dstAccount")
@CrossOrigin
public class DstAccountController {

    @Autowired
    private DstAccountService dstAccountService;

    /***
     * DstAccount分页条件搜索实现
     * @param dstAccount
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstAccount条件分页查询",notes = "分页条件查询DstAccount方法详情",tags = {"DstAccountController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstAccount对象",value = "传入JSON数据",required = false) DstAccount dstAccount, @PathVariable  int page, @PathVariable  int size){
        //调用DstAccountService实现分页条件查询DstAccount
        PageInfo<DstAccount> pageInfo = dstAccountService.findPage(dstAccount, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstAccount分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstAccount分页查询",notes = "分页查询DstAccount方法详情",tags = {"DstAccountController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstAccountService实现分页查询DstAccount
        PageInfo<DstAccount> pageInfo = dstAccountService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstAccount
     * @return
     */
    @ApiOperation(value = "DstAccount条件查询",notes = "条件查询DstAccount方法详情",tags = {"DstAccountController"})
    @PostMapping(value = "/search" )
    public Result<List<DstAccount>> findList(@RequestBody(required = false) @ApiParam(name = "DstAccount对象",value = "传入JSON数据",required = false) DstAccount dstAccount){
        //调用DstAccountService实现条件查询DstAccount
        List<DstAccount> list = dstAccountService.findList(dstAccount);
        return new Result<List<DstAccount>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstAccount根据ID删除",notes = "根据ID删除DstAccount方法详情",tags = {"DstAccountController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstAccountService实现根据主键删除
        dstAccountService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstAccount数据
     * @param dstAccount
     * @param id
     * @return
     */
    @ApiOperation(value = "DstAccount根据ID修改",notes = "根据ID修改DstAccount方法详情",tags = {"DstAccountController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstAccount对象",value = "传入JSON数据",required = false) DstAccount dstAccount,@PathVariable Integer id){
        //设置主键值
        dstAccount.setId(id);
        //调用DstAccountService实现修改DstAccount
        dstAccountService.update(dstAccount);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstAccount数据
     * @param dstAccount
     * @return
     */
    @ApiOperation(value = "DstAccount添加",notes = "添加DstAccount方法详情",tags = {"DstAccountController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstAccount对象",value = "传入JSON数据",required = true) DstAccount dstAccount){
        //调用DstAccountService实现添加DstAccount
        dstAccountService.add(dstAccount);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstAccount数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstAccount根据ID查询",notes = "根据ID查询DstAccount方法详情",tags = {"DstAccountController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstAccount> findById(@PathVariable Integer id){
        //调用DstAccountService实现根据主键查询DstAccount
        DstAccount dstAccount = dstAccountService.findById(id);
        return new Result<DstAccount>(true,StatusCode.OK,"查询成功",dstAccount);
    }

    /***
     * 查询DstAccount全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstAccount",notes = "查询所DstAccount有方法详情",tags = {"DstAccountController"})
    @GetMapping
    public Result<List<DstAccount>> findAll(){
        //调用DstAccountService实现查询所有DstAccount
        List<DstAccount> list = dstAccountService.findAll();
        return new Result<List<DstAccount>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

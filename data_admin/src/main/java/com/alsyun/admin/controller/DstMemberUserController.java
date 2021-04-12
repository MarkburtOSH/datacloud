package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstMemberUser;
import com.alsyun.admin.service.DstMemberUserService;
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
@Api(value = "DstMemberUserController")
@RestController
@RequestMapping("/dstMemberUser")
@CrossOrigin
public class DstMemberUserController {

    @Autowired
    private DstMemberUserService dstMemberUserService;

    /***
     * DstMemberUser分页条件搜索实现
     * @param dstMemberUser
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstMemberUser条件分页查询",notes = "分页条件查询DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstMemberUser对象",value = "传入JSON数据",required = false) DstMemberUser dstMemberUser, @PathVariable  int page, @PathVariable  int size){
        //调用DstMemberUserService实现分页条件查询DstMemberUser
        PageInfo<DstMemberUser> pageInfo = dstMemberUserService.findPage(dstMemberUser, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstMemberUser分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstMemberUser分页查询",notes = "分页查询DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstMemberUserService实现分页查询DstMemberUser
        PageInfo<DstMemberUser> pageInfo = dstMemberUserService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstMemberUser
     * @return
     */
    @ApiOperation(value = "DstMemberUser条件查询",notes = "条件查询DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @PostMapping(value = "/search" )
    public Result<List<DstMemberUser>> findList(@RequestBody(required = false) @ApiParam(name = "DstMemberUser对象",value = "传入JSON数据",required = false) DstMemberUser dstMemberUser){
        //调用DstMemberUserService实现条件查询DstMemberUser
        List<DstMemberUser> list = dstMemberUserService.findList(dstMemberUser);
        return new Result<List<DstMemberUser>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMemberUser根据ID删除",notes = "根据ID删除DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstMemberUserService实现根据主键删除
        dstMemberUserService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstMemberUser数据
     * @param dstMemberUser
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMemberUser根据ID修改",notes = "根据ID修改DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstMemberUser对象",value = "传入JSON数据",required = false) DstMemberUser dstMemberUser,@PathVariable Integer id){
        //设置主键值
        dstMemberUser.setId(id);
        //调用DstMemberUserService实现修改DstMemberUser
        dstMemberUserService.update(dstMemberUser);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstMemberUser数据
     * @param dstMemberUser
     * @return
     */
    @ApiOperation(value = "DstMemberUser添加",notes = "添加DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstMemberUser对象",value = "传入JSON数据",required = true) DstMemberUser dstMemberUser){
        //调用DstMemberUserService实现添加DstMemberUser
        dstMemberUserService.add(dstMemberUser);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstMemberUser数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMemberUser根据ID查询",notes = "根据ID查询DstMemberUser方法详情",tags = {"DstMemberUserController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstMemberUser> findById(@PathVariable Integer id){
        //调用DstMemberUserService实现根据主键查询DstMemberUser
        DstMemberUser dstMemberUser = dstMemberUserService.findById(id);
        return new Result<DstMemberUser>(true,StatusCode.OK,"查询成功",dstMemberUser);
    }

    /***
     * 查询DstMemberUser全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstMemberUser",notes = "查询所DstMemberUser有方法详情",tags = {"DstMemberUserController"})
    @GetMapping
    public Result<List<DstMemberUser>> findAll(){
        //调用DstMemberUserService实现查询所有DstMemberUser
        List<DstMemberUser> list = dstMemberUserService.findAll();
        return new Result<List<DstMemberUser>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

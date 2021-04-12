package com.alsyun.admin.controller;

import com.alsyun.admin.pojo.DstMemberUserCard;
import com.alsyun.admin.service.DstMemberUserCardService;
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
@Api(value = "DstMemberUserCardController")
@RestController
@RequestMapping("/dstMemberUserCard")
@CrossOrigin
public class DstMemberUserCardController {

    @Autowired
    private DstMemberUserCardService dstMemberUserCardService;

    /***
     * DstMemberUserCard分页条件搜索实现
     * @param dstMemberUserCard
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard条件分页查询",notes = "分页条件查询DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @PostMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@RequestBody(required = false) @ApiParam(name = "DstMemberUserCard对象",value = "传入JSON数据",required = false) DstMemberUserCard dstMemberUserCard, @PathVariable  int page, @PathVariable  int size){
        //调用DstMemberUserCardService实现分页条件查询DstMemberUserCard
        PageInfo<DstMemberUserCard> pageInfo = dstMemberUserCardService.findPage(dstMemberUserCard, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * DstMemberUserCard分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard分页查询",notes = "分页查询DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name = "page", value = "当前页", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "path", name = "size", value = "每页显示条数", required = true, dataType = "Integer")
    })
    @GetMapping(value = "/search/{page}/{size}" )
    public Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size){
        //调用DstMemberUserCardService实现分页查询DstMemberUserCard
        PageInfo<DstMemberUserCard> pageInfo = dstMemberUserCardService.findPage(page, size);
        return new Result<PageInfo>(true,StatusCode.OK,"查询成功",pageInfo);
    }

    /***
     * 多条件搜索品牌数据
     * @param dstMemberUserCard
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard条件查询",notes = "条件查询DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @PostMapping(value = "/search" )
    public Result<List<DstMemberUserCard>> findList(@RequestBody(required = false) @ApiParam(name = "DstMemberUserCard对象",value = "传入JSON数据",required = false) DstMemberUserCard dstMemberUserCard){
        //调用DstMemberUserCardService实现条件查询DstMemberUserCard
        List<DstMemberUserCard> list = dstMemberUserCardService.findList(dstMemberUserCard);
        return new Result<List<DstMemberUserCard>>(true,StatusCode.OK,"查询成功",list);
    }

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard根据ID删除",notes = "根据ID删除DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Integer id){
        //调用DstMemberUserCardService实现根据主键删除
        dstMemberUserCardService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 修改DstMemberUserCard数据
     * @param dstMemberUserCard
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard根据ID修改",notes = "根据ID修改DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @PutMapping(value="/{id}")
    public Result update(@RequestBody @ApiParam(name = "DstMemberUserCard对象",value = "传入JSON数据",required = false) DstMemberUserCard dstMemberUserCard,@PathVariable Integer id){
        //设置主键值
        dstMemberUserCard.setId(id);
        //调用DstMemberUserCardService实现修改DstMemberUserCard
        dstMemberUserCardService.update(dstMemberUserCard);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 新增DstMemberUserCard数据
     * @param dstMemberUserCard
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard添加",notes = "添加DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @PostMapping
    public Result add(@RequestBody  @ApiParam(name = "DstMemberUserCard对象",value = "传入JSON数据",required = true) DstMemberUserCard dstMemberUserCard){
        //调用DstMemberUserCardService实现添加DstMemberUserCard
        dstMemberUserCardService.add(dstMemberUserCard);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 根据ID查询DstMemberUserCard数据
     * @param id
     * @return
     */
    @ApiOperation(value = "DstMemberUserCard根据ID查询",notes = "根据ID查询DstMemberUserCard方法详情",tags = {"DstMemberUserCardController"})
    @ApiImplicitParam(paramType = "path", name = "id", value = "主键ID", required = true, dataType = "Integer")
    @GetMapping("/{id}")
    public Result<DstMemberUserCard> findById(@PathVariable Integer id){
        //调用DstMemberUserCardService实现根据主键查询DstMemberUserCard
        DstMemberUserCard dstMemberUserCard = dstMemberUserCardService.findById(id);
        return new Result<DstMemberUserCard>(true,StatusCode.OK,"查询成功",dstMemberUserCard);
    }

    /***
     * 查询DstMemberUserCard全部数据
     * @return
     */
    @ApiOperation(value = "查询所有DstMemberUserCard",notes = "查询所DstMemberUserCard有方法详情",tags = {"DstMemberUserCardController"})
    @GetMapping
    public Result<List<DstMemberUserCard>> findAll(){
        //调用DstMemberUserCardService实现查询所有DstMemberUserCard
        List<DstMemberUserCard> list = dstMemberUserCardService.findAll();
        return new Result<List<DstMemberUserCard>>(true, StatusCode.OK,"查询成功",list) ;
    }
}

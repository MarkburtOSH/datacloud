package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstMemberUser;
import com.alsyun.entity.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/****
 * @Author:Markburt
 * @Description:
 * @Date 2019/6/18 13:58
 *****/
@FeignClient(name="admin")
@RequestMapping("/dstMemberUser")
public interface DstMemberUserFeign {

    /***
     * DstMemberUser分页条件搜索实现
     * @param dstMemberUser
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstMemberUser dstMemberUser, @PathVariable int page, @PathVariable  int size);

    /***
     * DstMemberUser分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstMemberUser
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstMemberUser>> findList(@RequestBody(required = false) DstMemberUser dstMemberUser);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstMemberUser数据
     * @param dstMemberUser
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstMemberUser dstMemberUser,@PathVariable Integer id);

    /***
     * 新增DstMemberUser数据
     * @param dstMemberUser
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstMemberUser dstMemberUser);

    /***
     * 根据ID查询DstMemberUser数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstMemberUser> findById(@PathVariable Integer id);

    /***
     * 查询DstMemberUser全部数据
     * @return
     */
    @GetMapping
    Result<List<DstMemberUser>> findAll();
}
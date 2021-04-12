package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstMemberUserCard;
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
@RequestMapping("/dstMemberUserCard")
public interface DstMemberUserCardFeign {

    /***
     * DstMemberUserCard分页条件搜索实现
     * @param dstMemberUserCard
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstMemberUserCard dstMemberUserCard, @PathVariable int page, @PathVariable  int size);

    /***
     * DstMemberUserCard分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstMemberUserCard
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstMemberUserCard>> findList(@RequestBody(required = false) DstMemberUserCard dstMemberUserCard);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstMemberUserCard数据
     * @param dstMemberUserCard
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstMemberUserCard dstMemberUserCard,@PathVariable Integer id);

    /***
     * 新增DstMemberUserCard数据
     * @param dstMemberUserCard
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstMemberUserCard dstMemberUserCard);

    /***
     * 根据ID查询DstMemberUserCard数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstMemberUserCard> findById(@PathVariable Integer id);

    /***
     * 查询DstMemberUserCard全部数据
     * @return
     */
    @GetMapping
    Result<List<DstMemberUserCard>> findAll();
}
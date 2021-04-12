package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstShContractAdminister;
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
@RequestMapping("/dstShContractAdminister")
public interface DstShContractAdministerFeign {

    /***
     * DstShContractAdminister分页条件搜索实现
     * @param dstShContractAdminister
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstShContractAdminister dstShContractAdminister, @PathVariable int page, @PathVariable  int size);

    /***
     * DstShContractAdminister分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstShContractAdminister
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstShContractAdminister>> findList(@RequestBody(required = false) DstShContractAdminister dstShContractAdminister);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstShContractAdminister数据
     * @param dstShContractAdminister
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstShContractAdminister dstShContractAdminister,@PathVariable Integer id);

    /***
     * 新增DstShContractAdminister数据
     * @param dstShContractAdminister
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstShContractAdminister dstShContractAdminister);

    /***
     * 根据ID查询DstShContractAdminister数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstShContractAdminister> findById(@PathVariable Integer id);

    /***
     * 查询DstShContractAdminister全部数据
     * @return
     */
    @GetMapping
    Result<List<DstShContractAdminister>> findAll();
}
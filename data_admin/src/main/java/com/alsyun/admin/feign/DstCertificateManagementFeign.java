package com.alsyun.admin.feign;
import com.alsyun.admin.pojo.DstCertificateManagement;
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
@RequestMapping("/dstCertificateManagement")
public interface DstCertificateManagementFeign {

    /***
     * DstCertificateManagement分页条件搜索实现
     * @param dstCertificateManagement
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@RequestBody(required = false) DstCertificateManagement dstCertificateManagement, @PathVariable int page, @PathVariable  int size);

    /***
     * DstCertificateManagement分页搜索实现
     * @param page:当前页
     * @param size:每页显示多少条
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    Result<PageInfo> findPage(@PathVariable  int page, @PathVariable  int size);

    /***
     * 多条件搜索品牌数据
     * @param dstCertificateManagement
     * @return
     */
    @PostMapping(value = "/search" )
    Result<List<DstCertificateManagement>> findList(@RequestBody(required = false) DstCertificateManagement dstCertificateManagement);

    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    Result delete(@PathVariable Integer id);

    /***
     * 修改DstCertificateManagement数据
     * @param dstCertificateManagement
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    Result update(@RequestBody DstCertificateManagement dstCertificateManagement,@PathVariable Integer id);

    /***
     * 新增DstCertificateManagement数据
     * @param dstCertificateManagement
     * @return
     */
    @PostMapping
    Result add(@RequestBody DstCertificateManagement dstCertificateManagement);

    /***
     * 根据ID查询DstCertificateManagement数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Result<DstCertificateManagement> findById(@PathVariable Integer id);

    /***
     * 查询DstCertificateManagement全部数据
     * @return
     */
    @GetMapping
    Result<List<DstCertificateManagement>> findAll();
}
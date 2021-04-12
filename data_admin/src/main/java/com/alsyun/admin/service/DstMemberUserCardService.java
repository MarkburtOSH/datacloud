package com.alsyun.admin.service;

import com.alsyun.admin.pojo.DstMemberUserCard;
import com.github.pagehelper.PageInfo;

import java.util.List;

/****
 * @Author:Markburt
 * @Description:DstMemberUserCard业务层接口
 * @Date 2019/6/14 0:16
 *****/
public interface DstMemberUserCardService {

    /***
     * DstMemberUserCard多条件分页查询
     * @param dstMemberUserCard
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstMemberUserCard> findPage(DstMemberUserCard dstMemberUserCard, int page, int size);

    /***
     * DstMemberUserCard分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<DstMemberUserCard> findPage(int page, int size);

    /***
     * DstMemberUserCard多条件搜索方法
     * @param dstMemberUserCard
     * @return
     */
    List<DstMemberUserCard> findList(DstMemberUserCard dstMemberUserCard);

    /***
     * 删除DstMemberUserCard
     * @param id
     */
    void delete(Integer id);

    /***
     * 修改DstMemberUserCard数据
     * @param dstMemberUserCard
     */
    void update(DstMemberUserCard dstMemberUserCard);

    /***
     * 新增DstMemberUserCard
     * @param dstMemberUserCard
     */
    void add(DstMemberUserCard dstMemberUserCard);

    /**
     * 根据ID查询DstMemberUserCard
     * @param id
     * @return
     */
     DstMemberUserCard findById(Integer id);

    /***
     * 查询所有DstMemberUserCard
     * @return
     */
    List<DstMemberUserCard> findAll();
}

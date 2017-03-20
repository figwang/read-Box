package com.nigel.readbox.controller;

import com.nigel.readbox.entity.AdminInfo;

import java.util.List;

/**
 * 管理员信息管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  22:15
 */
public interface AdminController {
    /**
     * 添加管理员信息
     *
     * @param adminInfo 管理员信息
     * @return 成功返回success，失败返回fail
     */
    public String addAdminInfo(AdminInfo adminInfo);

    /**
     * 删除管理员信息
     *
     * @param adminCode 管理员唯一身份编码
     * @return 成功返回success，失败返回fail
     */
    public String delAdminInfo(String adminCode);

    /**
     * 模糊查询管理员信息
     *
     * @param search 模糊查询条件
     * @return 返回管理员信息列表
     */
    public List<AdminInfo> searchListByAdminInfo(String search);

    /**
     * 查询管理员详细信息
     *
     * @param adminCode 管理员唯一身份编码
     * @return 管理员详细信息，失败返回异常fail
     */
    public AdminInfo searchAdminInfo(String adminCode);

    /**
     * 修改管理员信息
     *
     * @param adminInfo 管理员基本信息
     * @return 成功返回success，失败返回fail
     */
    public String editAdminInfo(AdminInfo adminInfo);
}

package com.nigel.readbox.controller;

import com.nigel.readbox.entity.UserInfo;
import com.nigel.readbox.entity.vo.BaseUserInfoVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户信息管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  21:21
 */
@RequestMapping("/user")
public interface UserController {

    /**
     * 添加用户信息
     *
     * @param userInfo 用户基本信息
     * @return 成功返回success，失败返回fail
     */
    @RequestMapping(value = "/addUserInfo.do", method = RequestMethod.POST)
    public @ResponseBody
    String addUserInfo(@RequestBody BaseUserInfoVO userInfo);

    /**
     * 删除用户信息
     *
     * @param userCode 用户唯一身份编码
     * @return 成功返回success，失败返回fail
     */
    @RequestMapping(value = "/delUserInfo.do", method = RequestMethod.GET)
    public @ResponseBody
    String delUserInfo(@RequestParam String userCode);

    /**
     * 模糊查询用户信息
     *
     * @param search 模糊查询条件
     * @return 返回用户信息列表
     */
    @RequestMapping(value = "/searchListByUserInfo.do", method = RequestMethod.GET)
    public @ResponseBody
    List<UserInfo> searchListByUserInfo(@RequestParam String search);

    /**
     * 查询用户详细信息
     *
     * @param userCode 用户唯一身份编码
     * @return 用户详细信息，失败返回异常fail
     */
    @RequestMapping(value = "/searchListByUserInfo.do", method = RequestMethod.GET)
    public @ResponseBody
    UserInfo searchUserInfo(@RequestParam String userCode);

    /**
     * 修改用户信息
     *
     * @param userInfo 用户基本信息
     * @return 成功返回success，失败返回fail
     */
    @RequestMapping(value = "/searchListByUserInfo.do", method = RequestMethod.POST)
    public @ResponseBody
    String editUserInfo(@RequestBody BaseUserInfoVO userInfo);
}

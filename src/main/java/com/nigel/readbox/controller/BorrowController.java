package com.nigel.readbox.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 借阅信息管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  22:20
 */
@RequestMapping("borrow")
public interface BorrowController {
    /**
     * 图书借阅
     *
     * @param  bookCode 借阅图书code
     * @return 成功返回success，失败返回fail
     */
    @RequestMapping(value = "/addBorrow.do", method = RequestMethod.GET)
    public @ResponseBody
    String addBorrow(@RequestBody String bookCode);
    //1.借阅
    //2.续借
    //3.归还
    //4.查看借阅信息
    //5.未归还信息
    //6.已归还信息
}

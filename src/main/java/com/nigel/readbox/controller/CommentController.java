package com.nigel.readbox.controller;

import com.nigel.readbox.entity.BookComment;

import java.util.List;

/**
 * 用户评论图书管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  22:22
 */
public interface CommentController {

    /**
     * 添加评论信息
     * @param comment 评论基本信息
     * @return  成功返回success，失败返回fail
     */
    public String addComment(BookComment comment);

    /**
     * 删除评论信息
     * @param commentCode 评论唯一身份编码
     * @return 成功返回success，失败返回fail
     */
    public String delComment(String commentCode);

    /**
     * 模糊查询评论信息
     * @param search 模糊查询条件
     * @return 返回评论信息列表
     */
    public List<BookComment> searchListByComment(String search);

    /**
     * 查询评论详细信息
     * @param commentCode 评论唯一身份编码
     * @return 评论详细信息，失败返回异常fail
     */
    public BookComment searchComment(String commentCode);

    /**
     * 修改评论信息
     * @param comment 评论基本信息
     * @return 成功返回success，失败返回fail
     */
    public String editComment(BookComment comment);
}

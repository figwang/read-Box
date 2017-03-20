package com.nigel.readbox.controller;

import com.nigel.readbox.entity.BookInfo;
import java.util.List;

/**
 * 图书信息管理 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/20 0020  21:21
 */
public interface BookController {

    /**
     * 添加图书信息
     * @param bookInfo 图书基本信息
     * @return  成功返回success，失败返回fail
     */
    public String addBookInfo(BookInfo bookInfo);

    /**
     * 删除图书信息
     * @param bookCode 图书唯一身份编码
     * @return 成功返回success，失败返回fail
     */
    public String delBookInfo(String bookCode);

    /**
     * 模糊查询图书信息
     * @param search 模糊查询条件
     * @return 返回图书信息列表
     */
    public List<BookInfo> searchListByBookInfo(String search);

    /**
     * 查询图书详细信息
     * @param bookCode 图书唯一身份编码
     * @return 图书详细信息，失败返回异常fail
     */
    public BookInfo searchBookInfo(String bookCode);

    /**
     * 修改图书信息
     * @param bookInfo 图书基本信息
     * @return 成功返回success，失败返回fail
     */
    public String editBookInfo(BookInfo bookInfo);
}

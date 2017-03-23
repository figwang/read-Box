package com.nigel.readbox.service;

import com.nigel.readbox.entity.BookInfo;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:57
 */
public interface BookService {

    public String addBookInfo(BookInfo bookInfo);

    public String delBookInfo(String bookCode);

    public List<BookInfo> searchListByBookInfo(String search);

    public BookInfo searchBookInfo(String bookCode);

    public String editBookInfo(BookInfo bookInfo);
}

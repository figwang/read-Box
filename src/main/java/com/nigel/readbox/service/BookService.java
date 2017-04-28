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

    public int addBookInfo(BookInfo bookInfo);

    public int delBookInfo(String bookIsbn);

    public List<BookInfo> searchListByBookInfo(String search , String bookCompany);

    public BookInfo searchBookInfo(String bookIsbn);

    public int editBookInfo(BookInfo bookInfo);
}

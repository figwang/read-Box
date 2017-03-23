package com.nigel.readbox.service.impl;

import com.nigel.readbox.dao.BookInfoMapper;
import com.nigel.readbox.entity.BookInfo;
import com.nigel.readbox.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/24 0024  0:01
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookInfoMapper bookInfoMapper;

    public String addBookInfo(BookInfo bookInfo) {
        return null;
    }

    public String delBookInfo(String bookCode) {
        return null;
    }

    public List<BookInfo> searchListByBookInfo(String search) {
        return null;
    }

    public BookInfo searchBookInfo(String bookCode) {
        return null;
    }

    public String editBookInfo(BookInfo bookInfo) {
        return null;
    }
}

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

    public int addBookInfo(BookInfo bookInfo) {
        return bookInfoMapper.insertSelective(bookInfo);
    }

    public int delBookInfo(String bookIsbn) {
        return bookInfoMapper.deleteBybookIsbn(bookIsbn);
    }

    public List<BookInfo> searchListByBookInfo(String search , String bookCompany) {
        return bookInfoMapper.selectListByLike(search , bookCompany);
    }

    public BookInfo searchBookInfo(String bookIsbn) {
        return bookInfoMapper.selectByBookIsbn(bookIsbn);
    }

    public int editBookInfo(BookInfo bookInfo) {
        return bookInfoMapper.updateByBookIsbnSelective(bookInfo);
    }
}

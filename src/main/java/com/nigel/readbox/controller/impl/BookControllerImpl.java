package com.nigel.readbox.controller.impl;

import com.nigel.readbox.common.constant.Result;
import com.nigel.readbox.controller.BookController;
import com.nigel.readbox.entity.BookInfo;
import com.nigel.readbox.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:49
 */
@Controller
public class BookControllerImpl  implements BookController {

    @Autowired
    BookService bookService;

    public String addBookInfo(@RequestBody BookInfo bookInfo) {
        int result = bookService.addBookInfo(bookInfo);
        if(result > 0)
        {
            return Result.SUCCESS;
        }
        else
        {
            return Result.FAIL;
        }
    }

    public String delBookInfo(@RequestBody String bookIsbn) {
        int result = bookService.delBookInfo(bookIsbn);
        if(result > 0)
        {
            return Result.SUCCESS;
        }
        else
        {
            return Result.FAIL;
        }
    }

    public List<BookInfo> searchListByBookInfo() {
        return bookService.searchListByBookInfo("%%","TSG-BJ-001");
    }

    public BookInfo searchBookInfo(@RequestBody String bookIsbn) {
        return bookService.searchBookInfo(bookIsbn);
    }

    public String editBookInfo(@RequestBody BookInfo bookInfo) {
        int result = bookService.editBookInfo(bookInfo);
        if(result > 0)
        {
            return Result.SUCCESS;
        }
        else
        {
            return Result.FAIL;
        }
    }
}

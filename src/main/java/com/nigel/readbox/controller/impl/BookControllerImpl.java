package com.nigel.readbox.controller.impl;

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
        return null;
    }

    public String delBookInfo(@RequestBody String bookCode) {
        return null;
    }

    public List<BookInfo> searchListByBookInfo(@RequestBody String search) {
        return null;
    }

    public BookInfo searchBookInfo(@RequestBody String bookCode) {
        return null;
    }

    public String editBookInfo(@RequestBody BookInfo bookInfo) {
        return null;
    }
}

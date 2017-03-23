package com.nigel.readbox.service.impl;

import com.nigel.readbox.dao.BookCommentMapper;
import com.nigel.readbox.entity.BookComment;
import com.nigel.readbox.service.CommentService;
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
public class CommentServiceImpl implements CommentService {

    @Autowired
    BookCommentMapper bookCommentMapper;

    public String addComment(BookComment comment) {
        return null;
    }

    public String delComment(String commentCode) {
        return null;
    }

    public List<BookComment> searchListByComment(String search) {
        return null;
    }

    public BookComment searchComment(String commentCode) {
        return null;
    }

    public String editComment(BookComment comment) {
        return null;
    }
}

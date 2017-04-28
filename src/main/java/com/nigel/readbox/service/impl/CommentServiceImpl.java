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

    public int addComment(BookComment comment) {
        return bookCommentMapper.insert(comment);
    }

    public int delComment(String commentCode) {
        return bookCommentMapper.deleteByCommentCode(commentCode);
    }

    public List<BookComment> searchListByComment(String search) {
        return null;
    }

    public BookComment searchComment(String commentCode) {
        return bookCommentMapper.selectByCommentCode(commentCode);
    }

    public int editComment(BookComment comment) {
        return bookCommentMapper.updateByBookIsbn(comment);
    }
}

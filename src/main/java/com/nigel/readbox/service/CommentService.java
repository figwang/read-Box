package com.nigel.readbox.service;

import com.nigel.readbox.entity.BookComment;

import java.util.List;

/**
 * this is description of class .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/3/23 0023  23:59
 */
public interface CommentService {

    public int addComment(BookComment comment);

    public int delComment(String commentCode);

    public List<BookComment> searchListByComment(String search);

    public BookComment searchComment(String commentCode);

    public int editComment(BookComment comment);
}

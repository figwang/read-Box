package com.nigel.readbox.controller.impl;

import com.nigel.readbox.controller.CommentController;
import com.nigel.readbox.entity.BookComment;
import com.nigel.readbox.service.CommentService;
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
public class CommentControllerImpl implements CommentController {

    @Autowired
    CommentService commentService;

    public String addComment(@RequestBody BookComment comment) {
        return null;
    }

    public String delComment(@RequestBody String commentCode) {
        return null;
    }

    public List<BookComment> searchListByComment(@RequestBody String search) {
        return null;
    }

    public BookComment searchComment(@RequestBody String commentCode) {
        return null;
    }

    public String editComment(@RequestBody BookComment comment) {
        return null;
    }
}

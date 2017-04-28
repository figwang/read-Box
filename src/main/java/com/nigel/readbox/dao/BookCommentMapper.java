package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookComment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookCommentMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteByCommentCode(String commentCode);

    int insert(BookComment record);

    int insertSelective(BookComment record);

    BookComment selectByPrimaryKey(Integer id);

    BookComment selectByCommentCode(String commentCode);

    List<BookComment>  selectByBookIsbn(String commentIsbn);

    int updateByBookIsbnSelective(BookComment record);

    int updateByBookIsbn(BookComment record);
}
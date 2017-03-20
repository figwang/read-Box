package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookBorrow;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookBorrowMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookBorrow record);

    int insertSelective(BookBorrow record);

    BookBorrow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookBorrow record);

    int updateByPrimaryKey(BookBorrow record);
}
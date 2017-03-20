package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    BookInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);
}
package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface BookInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    BookInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKey(BookInfo record);
}
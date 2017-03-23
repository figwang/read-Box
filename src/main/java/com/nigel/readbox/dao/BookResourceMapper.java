package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookResource;
import org.springframework.stereotype.Repository;

@Repository
public interface BookResourceMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookResource record);

    int insertSelective(BookResource record);

    BookResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookResource record);

    int updateByPrimaryKey(BookResource record);
}
package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookResource;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookResourceMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookResource record);

    int insertSelective(BookResource record);

    BookResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookResource record);

    int updateByPrimaryKey(BookResource record);
}
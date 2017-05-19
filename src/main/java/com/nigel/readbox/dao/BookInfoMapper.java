package com.nigel.readbox.dao;

import com.nigel.readbox.entity.BookInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int deleteBybookIsbn(String bookIsbn);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    BookInfo selectByBookIsbn(Integer id);

    BookInfo selectByBookIsbn(String bookIsbn);

    List<BookInfo> selectListByLike(@Param("search")String search , @Param("bookCompany")String bookCompany);

    int updateByBookIsbnSelective(BookInfo record);

    int updateByBookIsbn(BookInfo record);
}
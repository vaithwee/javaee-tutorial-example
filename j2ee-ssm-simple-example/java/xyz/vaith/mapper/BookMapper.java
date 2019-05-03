package xyz.vaith.mapper;

import org.apache.ibatis.annotations.Select;
import xyz.vaith.domain.Book;

import java.util.List;

public interface BookMapper {
    @Select("SELECT * FROM `tb_book`")
    List<Book> findAll();
}

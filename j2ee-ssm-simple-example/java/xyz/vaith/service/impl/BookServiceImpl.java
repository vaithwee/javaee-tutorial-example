package xyz.vaith.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.vaith.domain.Book;
import xyz.vaith.mapper.BookMapper;
import xyz.vaith.service.BookService;

import java.util.List;
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getAll() {
        return bookMapper.findAll();
    }
}

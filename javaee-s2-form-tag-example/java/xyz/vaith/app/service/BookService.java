package xyz.vaith.app.service;

import xyz.vaith.app.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books;
    public BookService() {
        books = new ArrayList<Book>();
        books.add(new Book("曹雪芹", "红楼梦"));
        books.add(new Book("吴承恩","西游记"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

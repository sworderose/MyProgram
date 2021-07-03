package com.demo.service;

import com.demo.pojo.Books;

import java.util.List;

public interface BookService {
    int addBooks(Books books);
    int deleteBooksByID(int bookID);
    int updateBooks(Books books);
    Books selectBooksByID(int bookID);
    List<Books> selectAllBook();
    List<Books> selectBooksByName(String bookName);
}

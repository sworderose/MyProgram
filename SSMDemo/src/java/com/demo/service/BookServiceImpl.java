package com.demo.service;

import com.demo.dao.BookMapper;
import com.demo.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
//    Service层调dao层,用私有的方法调用（不能new）
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;

    }

    @Override
    public int addBooks(Books books) {
        System.out.println("成功插入");
        return bookMapper.addBooks(books);

    }

    @Override
    public int deleteBooksByID(int bookID) {
        System.out.println("成功删除");
        return bookMapper.deleteBooksByID(bookID);
    }

    @Override
    public int updateBooks(Books books) {
        System.out.println("成功更新");
        return bookMapper.updateBooks(books);
    }

    @Override
    public Books selectBooksByID(int bookID) {
        System.out.println("选中一本");
        return bookMapper.selectBooksByID(bookID);
    }

    @Override
    public List<Books> selectAllBook() {
        System.out.println("选中全部");
        return bookMapper.selectAllBook();
    }
    @Override
    public List<Books> selectBooksByName(String bookName){
        System.out.println("选中关键词");
        return  bookMapper.selectBooksByName(bookName);
    }
}

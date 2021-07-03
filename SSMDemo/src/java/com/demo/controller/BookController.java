package com.demo.controller;

import com.demo.pojo.Books;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
//    查询全部书籍
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> list=bookService.selectAllBook();
        model.addAttribute("msg",list);
        return "test";
    }
    @RequestMapping("/addbook")
    public String book(){
        return "addform";
    }
    @RequestMapping("/add")
    public String addbook(Books books){
        System.out.println(books);
        bookService.addBooks(books);
        return "redirect:/book/allbook";
    }
    @RequestMapping("/delete")
    public String deletebook(int bookID){
        bookService.deleteBooksByID(bookID);
        return "redirect:/book/allbook";
    }
    @RequestMapping("/update")
    public String update(int bookID,Model model){
        Books books = bookService.selectBooksByID(bookID);
        model.addAttribute("book",books);
        return "updateform";
    }
    @RequestMapping("/updatebook")
    public String updatebook(Books books){
        System.out.println(books);
        bookService.updateBooks(books);
        return "redirect:/book/allbook";
    }
    @RequestMapping("/selectbyname")
    public String selectbyName(String bookName,Model model){
        System.out.println(bookName);
        List<Books> list=bookService.selectBooksByName(bookName);
        model.addAttribute("msg",list);
        return "selectbyname";
    }
}

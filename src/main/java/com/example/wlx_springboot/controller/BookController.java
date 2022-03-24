package com.example.wlx_springboot.controller;

import com.example.wlx_springboot.Service.BookService;
import com.example.wlx_springboot.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/addbook")
    public void addbook()
    {

        Book b1=new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实甫");
        int i=bookService.addBook(b1);

    }
    @GetMapping("/getBooks")
    public List<Book> getBooks()
   {
        return bookService.getBooks();
    }
    @GetMapping("/upload")
    public String tuUpload()
    {
        return "upload";
    }
}

package com.example.wlx_springboot.controller;

import com.example.wlx_springboot.book.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/book")
    public ModelAndView book()
    {
        List<Book> books=new ArrayList<>();
        Book book = new Book();
        book.setId(1);
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        books.add(book);
        ModelAndView mv=new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("books");
        return mv;

    }
    @GetMapping("/upload")
    public String tuUpload()
    {

        return "upload";
    }
}

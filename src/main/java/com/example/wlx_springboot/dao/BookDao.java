package com.example.wlx_springboot.dao;

import com.example.wlx_springboot.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {
    @Autowired
   JdbcTemplate jdbcTemplate;
    public int addBook(Book book)
    {
       return jdbcTemplate.update("Insert INTO book(name, anthor) values (?,?)",book.getName(),book.getAuthor());
   }
   public List<Book> getBooks()
   {
       return jdbcTemplate.query("select id,name,author from book",new BeanPropertyRowMapper<>(Book.class));
   }
}

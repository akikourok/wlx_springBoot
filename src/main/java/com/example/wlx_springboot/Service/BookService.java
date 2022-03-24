package com.example.wlx_springboot.Service;

import com.example.wlx_springboot.book.Book;
import com.example.wlx_springboot.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    public int addBook(Book book){return bookDao.addBook(book);}
   public List<Book> getBooks()
   {
      return bookDao.getBooks();
   }
}

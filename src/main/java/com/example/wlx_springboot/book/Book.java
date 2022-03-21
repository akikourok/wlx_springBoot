package com.example.wlx_springboot.book;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Book {
   private String name;
   private String author;
   private Float price;
   private Integer id;
    @JsonIgnore
    @JsonFormat(pattern ="yyyy-MM-dd" )
   private Date publicationDate ;

    public Book(String name, String author, Float price, Integer id, Date publicationDate) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.id = id;
        this.publicationDate = publicationDate;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}

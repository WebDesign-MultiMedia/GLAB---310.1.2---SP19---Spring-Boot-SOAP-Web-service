package com.perscholas.SoapWebServices;

import com.perscholas.xml.book.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
//import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {
    private static final Map<Integer, Book> books = new HashMap<>();

    @PostConstruct
    public  void initData(){
        Book javaBook = new Book();
        javaBook.setId(1);
        javaBook.setTitle("Head first java");
        javaBook.setPages(400);
        books.put(javaBook.getId(), javaBook);

        Book springBook = new Book();
        springBook.setId(2);
        springBook.setTitle("Spring in action");
        springBook.setPages(400);
        books.put(springBook.getId(), springBook);

        Book pythonBook = new Book();
        pythonBook.setId(3);
        pythonBook.setTitle("Learning pythin");
        pythonBook.setPages(400);
        books.put(pythonBook.getId(), pythonBook);

        Book hibBook = new Book();
        hibBook.setId(4);
        hibBook.setTitle("Hibernate in action");
        hibBook.setPages(400);
        books.put(hibBook.getId(), hibBook);
    }

    public Book findookById(int id){
        Assert.notNull(id, "The book's name must not be null");
        return books.get(id);
    }
}

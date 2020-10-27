package com.bookapp.dao;

 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 

import org.springframework.stereotype.Service;

 

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO {

 

    @Override
    public List<Book> getAllBooks() {
        // TODO Auto-generated method stub
        return showBookList();
    }

 

    @Override
    public List<Book> getByAuthor(String author) throws BookNotFoundException {
        // TODO Auto-generated method stub
        List<Book> newbooklist=new ArrayList<>();
        for(Book book:showBookList()) {
            if(book.getAuthor().equals(author))
                newbooklist.add(book);
        }
        if(newbooklist.isEmpty()) {
            throw new BookNotFoundException("Author not found");
            
        }
        
        return newbooklist;
    }

 

    @Override
    public List<Book> getByCategory(String category)throws BookNotFoundException {
        // TODO Auto-generated method stub
        
        /*
         * for(Book book:showBookList()) { if(book.getCategory().equals(category))
         * newbooklist.add(book); }
         */
        List<Book> newbooklist =showBookList()
        .stream()
        .filter((book)->book.getCategory().equals(category))
        .collect(Collectors.toList());
        if(newbooklist.isEmpty()) {
            throw new BookNotFoundException("Nocategory");
        }
        return newbooklist;
         
    }

 

    @Override
    public Book getById(int id)throws BookNotFoundException {
        // TODO Auto-generated method stub
         
        return showBookList()
                .stream()
                .filter((book)->book.getBookId()==id)
                .findAny()
                .orElseThrow(()->new BookNotFoundException("id not found"));
        
    }
    private List<Book> showBookList(){
        return Arrays.asList(
                new Book(11,"Learn java","kathy","tech",900.00),
                new Book(12,"7habits","steve","selfhepl",1000.0),
                new Book(13,"Ikagai","tom","Selfhelp",1000.0)
            );
    }

 

}
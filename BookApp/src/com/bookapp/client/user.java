package com.bookapp.client;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class user {
	public static void main(String[] args) {
		BookService BookService=new BookServiceImpl();
		
		BookService.getAllBooks();
		List<Book> bookList = BookService.getAllBooks();
		for(Book book:bookList)
			System.out.println(book);
			
		}
		
	}


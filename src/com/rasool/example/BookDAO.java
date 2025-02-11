package com.rasool.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public static List<Book> getBooks(){
		List<Book> books=new ArrayList<>();
		books.add(new Book(101,"java",400));
		books.add(new Book(101,"hib",200));
		books.add(new Book(101,"spring",700));
		books.add(new Book(101,"web",900));
		return books;
		
		
	}
}

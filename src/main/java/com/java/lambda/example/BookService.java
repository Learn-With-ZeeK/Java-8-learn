//Sorting on the basis of name

package com.java.lambda.example;


import java.util.Collections;
import java.util.List;

public class BookService {

	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		
		//Books Sorted in ascending order of name
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBooksinSort());
	}
}


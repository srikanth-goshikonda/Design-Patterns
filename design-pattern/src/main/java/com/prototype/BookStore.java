package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable {
	public String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public ArrayList<Book> books = new ArrayList<Book>();

	public void loadBooks() {
		books.add(new Book(1, "Maths", 255.68));
		books.add(new Book(2, "Science", 1105.68));
		books.add(new Book(3, "Telugu", 102.68));
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected BookStore clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookStore bookStore = new BookStore();
		bookStore.bookName = this.bookName;
		bookStore.books = (ArrayList<Book>) this.books.clone();
		return bookStore;
	}

	@Override
	public String toString() {
		return "BookStore [bookName=" + bookName + ", books=" + books + "]";
	}

}

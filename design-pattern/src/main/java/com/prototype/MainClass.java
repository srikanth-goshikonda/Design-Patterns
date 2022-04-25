package com.prototype;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {

		BookStore bookStore = new BookStore();
		bookStore.loadBooks();
		bookStore.setBookName("A");
		BookStore bookStore1 = (BookStore) bookStore.clone();
		System.out.println("=========Before Chaning===========");
		System.out.println(bookStore);
		System.out.println(bookStore1);

		bookStore1.setBookName("B");
		bookStore1.getBooks().remove(0);

		System.out.println("==========After Changing===========");
		System.out.println(bookStore);
		System.out.println(bookStore1);

	}
}

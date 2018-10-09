package by.bsuir.Kaminsky.task13;

import by.bsuir.Kaminsky.task12.Book;

public class Main {
	public static void main(String... args)
	{
		Book book = new ProgrammerBook("Война и мир","Толстой Л.Н", 228,3,"русский",4);
		Book book2 = new ProgrammerBook("Война и мир","Толстой Л.Н", 228,2,"русский",4);
		System.out.println(book.toString());
		System.out.println(book2.toString());
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book.equals(book2));
	}
}

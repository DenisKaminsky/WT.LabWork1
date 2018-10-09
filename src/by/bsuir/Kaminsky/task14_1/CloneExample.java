package by.bsuir.Kaminsky.task14_1;

import by.bsuir.Kaminsky.task12.Book;

public class CloneExample {
	public static void main(String... args)
	{
		Book book = new Book("Война и мир","Толстой Л.Н", 220,4);
		Book book2 = book.clone();
		System.out.println(book.toString());
		System.out.println("Hash: "+book.hashCode());		
		System.out.println(book2.toString());
		System.out.println("Hash: "+book2.hashCode());
		System.out.println(book.equals(book2));
	}
}

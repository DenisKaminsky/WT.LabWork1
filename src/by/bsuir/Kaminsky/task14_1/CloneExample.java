package by.bsuir.Kaminsky.task14_1;

import by.bsuir.Kaminsky.task12.Book;
import reader.ConsoleReader;

public class CloneExample {
	public static void main(String... args)	{
		Book book,book2;
		String title,author;
		Integer price,isbn;
		
		System.out.println("Book1: ");
		System.out.print("Input title: ");
		title = ConsoleReader.getString();
		System.out.print("Input author: ");
		author = ConsoleReader.getString();
		System.out.print("Input price: ");
		price = ConsoleReader.getPostitveInteger();
		System.out.print("Input serial number(isbn): ");
		isbn = ConsoleReader.getPostitveInteger();		
		book = new Book(title,author,price,isbn);
		System.out.println();
		
		book2 = book.clone();
		System.out.println(book.toString());
		System.out.println("Hash: "+book.hashCode());		
		System.out.println(book2.toString());
		System.out.println("Hash: "+book2.hashCode());
		System.out.println(book.equals(book2));
	}
}

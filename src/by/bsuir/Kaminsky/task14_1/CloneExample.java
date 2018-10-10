package by.bsuir.Kaminsky.task14_1;

import by.bsuir.Kaminsky.task12.Book;
import reader.ConsoleReader;

public class CloneExample {
	public static void main(String... args)
	{
		System.out.println("Book1: ");
		System.out.print("Input title: ");
		String title = ConsoleReader.GetString();
		System.out.print("Input author: ");
		String author = ConsoleReader.GetString();
		System.out.print("Input price: ");
		Integer price = ConsoleReader.GetPostitveInteger();
		System.out.print("Input serial number(isbn): ");
		Integer isbn = ConsoleReader.GetPostitveInteger();		
		Book book = new Book(title,author,price,isbn);
		System.out.println();
		
		Book book2 = book.clone();
		System.out.println(book.toString());
		System.out.println("Hash: "+book.hashCode());		
		System.out.println(book2.toString());
		System.out.println("Hash: "+book2.hashCode());
		System.out.println(book.equals(book2));
	}
}

package by.bsuir.Kaminsky.task14_2;

import java.util.ArrayList;

import by.bsuir.Kaminsky.task12.Book;
import reader.ConsoleReader;

public class Main {
	public static void main(String... args)	{
		ArrayList<Book> books = new ArrayList<Book>();
		String title,author;
		Integer price,isbn;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Book"+(i+1)+": ");
			System.out.print("Input title: ");
			title = ConsoleReader.getString();
			System.out.print("Input author: ");
			author = ConsoleReader.getString();
			System.out.print("Input price: ");
			price = ConsoleReader.getPostitveInteger();
			System.out.print("Input serial number(isbn): ");
			isbn = ConsoleReader.getPostitveInteger();
			ConsoleReader.fflush();	
			books.add(new Book(title,author,price,isbn));
			System.out.println();
		}		
		
		books.sort(null);
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}

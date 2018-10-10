package by.bsuir.Kaminsky.task14_2;

import java.util.ArrayList;

import by.bsuir.Kaminsky.task12.Book;
import reader.ConsoleReader;

public class Main {
	public static void main(String... args)
	{
		ArrayList<Book> books = new ArrayList<Book>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Book"+(i+1)+": ");
			System.out.print("Input title: ");
			String title = ConsoleReader.GetString();
			System.out.print("Input author: ");
			String author = ConsoleReader.GetString();
			System.out.print("Input price: ");
			Integer price = ConsoleReader.GetPostitveInteger();
			System.out.print("Input serial number(isbn): ");
			Integer isbn = ConsoleReader.GetPostitveInteger();
			books.add(new Book(title,author,price,isbn));
			System.out.println();
			}		
		
		books.sort(null);
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}

package by.bsuir.Kaminsky.task13;

import by.bsuir.Kaminsky.task12.Book;
import reader.ConsoleReader;

public class Main {
	public static void main(String... args)
	{
		Book[] books = new Book[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("ProgrammerBook"+(i+1)+": ");
			System.out.print("Input title: ");
			String title = ConsoleReader.GetString();
			System.out.print("Input author: ");
			String author = ConsoleReader.GetString();
			System.out.print("Input price: ");
			Integer price = ConsoleReader.GetPostitveInteger();
			System.out.print("Input serial number(isbn): ");
			Integer isbn = ConsoleReader.GetPostitveInteger();		
			System.out.print("Input language: ");
			String language = ConsoleReader.GetString();			
			System.out.print("Input level: ");
			Integer level = ConsoleReader.GetPostitveInteger();
			books[i] = new ProgrammerBook(title,author,price,isbn,language,level);
			System.out.println();
			}		
		
		System.out.println("Your books: ");
		System.out.println(books[0].toString());
		System.out.println("Hash: "+books[0].hashCode());		
		System.out.println(books[1].toString());
		System.out.println("Hash: "+books[1].hashCode());
		System.out.println(books[0].equals(books[1]));
	}
}

package by.bsuir.Kaminsky.task15;

import java.util.ArrayList;
import java.util.Comparator;
import by.bsuir.Kaminsky.task12.Book;
import reader.ConsoleReader;

public class Main {

	private static ArrayList<Comparator<Book>> getComparators() {
        ArrayList<Comparator<Book>> comparators = new ArrayList<>();
        comparators.add(new BookAuthorAndTitleComparator());
        comparators.add(new BookAuthorComparator());
        comparators.add(new BookAuthorTitlePriceComparator());
        comparators.add(new BookPriceComparator());
        comparators.add(new BookTitleAndAuthorComparator());
        comparators.add(new BookTitleComparator());
        return comparators;
    }
	
	public static void main(String... args)	{
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
		
		ArrayList<Comparator<Book>> comparators = getComparators();
		
		for (Comparator<Book> comparator : comparators) {
            books.sort(comparator);
            System.out.println("Comparator: "+comparator.toString());
            System.out.println(books);
        }
	}
}

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
		ArrayList<Comparator<Book>> comparators;
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
		
		comparators = getComparators();		
		for (Comparator<Book> comparator : comparators) {
            books.sort(comparator);
            System.out.println("Comparator: "+comparator.toString());
            System.out.println(books);
        }
	}
}

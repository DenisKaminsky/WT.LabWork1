package by.bsuir.Kaminsky.task15;

import java.util.Comparator;
import by.bsuir.Kaminsky.task12.Book;

public class BookTitleAndAuthorComparator implements Comparator<Book> {
		
	public int compare(Book book1, Book book2){		     
		Comparator<Book> titleComp = new BookTitleComparator().thenComparing(new BookAuthorComparator());
	    return titleComp.compare(book1, book2);
	}
}


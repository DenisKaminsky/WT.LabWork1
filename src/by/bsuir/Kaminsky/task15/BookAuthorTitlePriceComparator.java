package by.bsuir.Kaminsky.task15;

import java.util.Comparator;
import by.bsuir.Kaminsky.task12.Book;

public class BookAuthorTitlePriceComparator {
	
	public int compare(Book book1, Book book2){		     
		Comparator<Book> authorComp = new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
	    return authorComp.compare(book1, book2);
	}
}

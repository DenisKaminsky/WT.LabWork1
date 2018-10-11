package by.bsuir.Kaminsky.task15;

import java.util.Comparator;
import by.bsuir.Kaminsky.task12.Book;

public class BookAuthorAndTitleComparator implements Comparator<Book>{
	
	public int compare(Book book1, Book book2){		     
		Comparator<Book> authorComp = new BookAuthorComparator().thenComparing(new BookTitleComparator());
	    return authorComp.compare(book1, book2);
	}
}

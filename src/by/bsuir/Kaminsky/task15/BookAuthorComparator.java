package by.bsuir.Kaminsky.task15;

import java.util.Comparator;
import by.bsuir.Kaminsky.task12.Book;

public class BookAuthorComparator implements Comparator<Book>{
	
	public int compare(Book book1, Book book2){	     
        return book1.getAuthor().compareTo(book2.getAuthor());
    }	
}

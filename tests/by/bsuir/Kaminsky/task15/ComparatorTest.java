package by.bsuir.Kaminsky.task15;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task12.Book;

class ComparatorTest {

	private Comparator<Book> comparator;
	private ArrayList<Book> books;
	private boolean IsEmpty = true;
	private Book book1,book2,book3,book4,book5,book6;
	
	private void FillList()
	{
		book1 = new Book("Title1","Author4", 320,4);
		book2 = new Book("Title4","Author2", 214,1);
		book3 = new Book("Title2","Author1", 500,5);
		book4 = new Book("Title3","Author3", 325,6);
		book5 = new Book("Title1","Author2", 400,2);
		book6 = new Book("Title2","Author1", 400,2);
		books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		IsEmpty = false;
	}
	
	@Test
	void BookTitleComparatorTest() {
		if (IsEmpty)
			FillList();
		comparator = new BookTitleComparator();
		books.sort(comparator);
		assertEquals(new ArrayList<>(Arrays.asList(book1,book3,book4,book2)), books);
	}
	
	@Test
	void BookAuthorComparatorTest() {
		if (IsEmpty)
			FillList();
		comparator = new BookAuthorComparator();
		books.sort(comparator);
		assertEquals(new ArrayList<>(Arrays.asList(book3,book2,book4,book1)), books);
	}
	
	@Test
	void BookPriceComparatorTest() {
		if (IsEmpty)
			FillList();
		comparator = new BookPriceComparator();
		books.sort(comparator);
		assertEquals(new ArrayList<>(Arrays.asList(book2,book1,book4,book3)), books);
	}
	
	
	@Test
	void BookTitleAndAuthorComparatorTest() {
		if (IsEmpty)
			FillList();		
		books.add(book5);
		comparator = new BookTitleAndAuthorComparator();
		books.sort(comparator);
		assertEquals(new ArrayList<>(Arrays.asList(book5,book1,book3,book4,book2)), books);
		books.remove(book5);
	}
	
	
	@Test
	void BookAuthorAndTitleComparatorTest() {
		if (IsEmpty)
			FillList();
		books.add(book5);
		comparator = new BookAuthorAndTitleComparator();
		books.sort(comparator);
		assertEquals(new ArrayList<>(Arrays.asList(book3,book5,book2,book4,book1)), books);
		books.remove(book5);
	}
	
	
	@Test
	void BookAuthorTitlePriceComparatorTest() {
		if (IsEmpty)
			FillList();
		books.add(book6);
		comparator = new BookAuthorTitlePriceComparator();
		books.sort(comparator);
		assertEquals(new ArrayList<>(Arrays.asList(book6,book3,book2,book4,book1)), books);
		books.remove(book6);
	}
	
}

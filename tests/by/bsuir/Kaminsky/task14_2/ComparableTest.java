package by.bsuir.Kaminsky.task14_2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task12.Book;

class ComparableTest {

	@Test
	void SortTest1() {
		Book b1 = new Book("Война и мир","Толстой Л.Н", 220,4);
		Book b2 = new Book("Отцы и дети","Тургенев И.С", 500,1);
		Book b3 = new Book("Евгений Онегин","Пушкин А.С", 317,5);		
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.sort(null);
		
		assertEquals(3, books.size());
		assertTrue(books.get(0) == b2);
		assertTrue(books.get(1) == b1);
		assertTrue(books.get(2) == b3);
		
	}
	
	@Test
	void SortTest2() {
		Book b1 = new Book("Горе от ума","Грибоедов А.С", 400,4);
		Book b2 = new Book("Анна Каренина","Толстой Л.Н", 300,3);
		Book b3 = new Book("Капитанская Дочка","Пушкин А.С", 200,2);	
		Book b4 = new Book("Мастер и Маргарита","Булгаков М.А", 100,1);
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.sort(null);
		
		assertEquals(4, books.size());
		assertTrue(books.get(0) == b4);
		assertTrue(books.get(1) == b3);
		assertTrue(books.get(2) == b2);
		assertTrue(books.get(3) == b1);
	}
}

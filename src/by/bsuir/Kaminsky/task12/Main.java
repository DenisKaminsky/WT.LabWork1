package by.bsuir.Kaminsky.task12;

import java.util.ArrayList;

public class Main {
	
	public static void main(String... args)
	{
		Book book = new Book("Война и мир","Толстой Л.Н", 220,4);
		Book book2 = new Book("Отцы и дети","Тургенев И.С.", 500,1);
		System.out.println(book.toString());
		System.out.println("Hash: "+book.hashCode());		
		System.out.println(book2.toString());
		System.out.println("Hash: "+book2.hashCode());
		System.out.println(book.equals(book2));
		System.out.println(book.equals(book));
		
		//Comparable
		Book book3 = new Book("Евгений Онегин","Пушкин А.С", 317,5);
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(book);
		books.add(book2);
		books.add(book3);
		books.sort(null);
		for (Book book1 : books) {
			System.out.println(book1.toString());
		}	
		
		//Comparator
	}
}

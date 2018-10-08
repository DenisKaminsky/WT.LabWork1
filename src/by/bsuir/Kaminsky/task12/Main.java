package by.bsuir.Kaminsky.task12;

public class Main {
	public static void main(String... args)
	{
		Book book = new Book("Война и мир","Толстой Л.Н", 228);
		Book book2 = book.clone();//new Book("Война и мир","Толстой Л.Н", 228);
		System.out.println(book.toString());
		System.out.println(book2.toString());
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book.equals(book));
		System.out.println(book.toString());
		System.out.println(book2.toString());
	}
}

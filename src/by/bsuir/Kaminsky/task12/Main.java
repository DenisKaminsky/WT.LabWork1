package by.bsuir.Kaminsky.task12;

public class Main {
	public static void main(String... args)
	{
		Book book = new Book("����� � ���","������� �.�", 220,4);
		Book book2 = new Book("���� � ����","�������� �.�.", 500,6);
		System.out.println(book.toString());
		System.out.println("Hash: "+book.hashCode());		
		System.out.println(book2.toString());
		System.out.println("Hash: "+book2.hashCode());
		System.out.println(book.equals(book2));
		System.out.println(book.equals(book));
	}
}

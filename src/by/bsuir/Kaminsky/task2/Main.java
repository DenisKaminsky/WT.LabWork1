package by.bsuir.Kaminsky.task2;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){		
		System.out.print("Input x coordinate: ");
		int x = ConsoleReader.GetInteger();
		System.out.print("Input y coordinate: ");
		int y = ConsoleReader.GetInteger();
		System.out.println("Is Belong Area = "+AreaIdentifier.IsBelongArea(x, y));		
	}
}

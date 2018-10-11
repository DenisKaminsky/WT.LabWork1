package by.bsuir.Kaminsky.task2;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){	
		int x,y;
		
		System.out.print("Input x coordinate: ");
		x = ConsoleReader.getInteger();
		System.out.print("Input y coordinate: ");
		y = ConsoleReader.getInteger();
		System.out.println("Is Belong Area = "+AreaIdentifier.isBelongArea(x, y));		
	}
}

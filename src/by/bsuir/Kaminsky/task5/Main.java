package by.bsuir.Kaminsky.task5;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		int count;
		int[] mass;
		
		System.out.print("Input array numbers count: ");
		count = ConsoleReader.getPostitveInteger();
		System.out.println("Input array: ");
		mass = ConsoleReader.getIntegerArray(count);
		System.out.println("Extra elements count: "+MaxIncreasingSequence.findMinCountExtraItems(mass));
	}
}

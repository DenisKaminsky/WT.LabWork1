package by.bsuir.Kaminsky.task5;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		System.out.print("Input array numbers count: ");
		int count = ConsoleReader.GetPostitveInteger();
		System.out.println("Input array: ");
		int[] mass = ConsoleReader.GetIntegerArray(count);
		System.out.println("Extra elements count: "+MaxIncreasingSequence.FindMinCountExtraItems(mass));
	}
}

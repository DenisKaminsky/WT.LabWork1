package by.bsuir.Kaminsky.task4;

import java.util.ArrayList;
import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){	
		int count;
		int[] mass;
		
		System.out.print("Input array numbers count: ");
		count = ConsoleReader.getPostitveInteger();
		System.out.println("Input array: ");
		mass = ConsoleReader.getIntegerArray(count);
	    ArrayList<Integer> list = PrimeNumbersVerifier.findPrimeNumberIndex(mass);
	    System.out.println("Prime numbers indexes: "+list);		
	}
}

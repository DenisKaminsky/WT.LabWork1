package by.bsuir.Kaminsky.task4;

import java.util.ArrayList;
import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){	  
		System.out.print("Input array numbers count: ");
		int count = ConsoleReader.GetPostitveInteger();
		System.out.println("Input array: ");
		int[] mass = ConsoleReader.GetIntegerArray(count);
	    ArrayList<Integer> list = PrimeNumbersVerifier.FindPrimeNumberIndex(mass);
	    System.out.println("Prime numbers indexes: "+list);		
	}
}

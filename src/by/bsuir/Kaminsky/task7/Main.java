package by.bsuir.Kaminsky.task7;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		int count;
		double[] array;
		
		System.out.print("Input array numbers count: ");
		count = ConsoleReader.getPostitveInteger();
		System.out.println("Input array: ");
		array = ConsoleReader.getDoubleArray(count);
		System.out.println("Original array: ");
		for (int i = 0; i< array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Sorted array: ");
		array = ShellSort.sort(array);
		for (int i = 0; i< array.length;i++) {
			System.out.print(array[i]+" ");
		}
		//{32,95,16,82,24,66,35,19,75,54,40,43,93};
	}
}

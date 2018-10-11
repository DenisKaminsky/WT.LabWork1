package by.bsuir.Kaminsky.task6;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		int count;
		double[] array;
		double[][] result;
		
		System.out.print("Input array numbers count: ");
		count = ConsoleReader.getPostitveInteger();
		System.out.println("Input array: ");
		array = ConsoleReader.getDoubleArray(count);
		System.out.println("Matrix: ");
		result = MatrixGenerator.generateMatrix(array);
		MatrixGenerator.printMatrix(result);
	}
}

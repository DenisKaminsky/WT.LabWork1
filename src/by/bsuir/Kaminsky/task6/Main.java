package by.bsuir.Kaminsky.task6;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		System.out.print("Input array numbers count: ");
		int count = ConsoleReader.GetPostitveInteger();
		System.out.println("Input array: ");
		double[] array = ConsoleReader.GetDoubleArray(count);
		System.out.println("Matrix: ");
		double[][] result = MatrixGenerator.GenerateMatrix(array);
		MatrixGenerator.PrintMatrix(result);
	}
}

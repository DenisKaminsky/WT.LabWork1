package by.bsuir.Kaminsky.task1;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		System.out.print("Input x: ");
		double x = ConsoleReader.GetDouble();
		System.out.print("Input y: ");
		double y = ConsoleReader.GetDouble();
		System.out.println("Result = "+ExpressionCalculator.Calculate(x, y));
	}
}

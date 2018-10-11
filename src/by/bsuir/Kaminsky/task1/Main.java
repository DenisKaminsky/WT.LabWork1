package by.bsuir.Kaminsky.task1;

import reader.ConsoleReader;

public class Main {
	
	public static void main(String ... args){
		double x,y;
		
		System.out.print("Input x: ");
		x = ConsoleReader.getDouble();
		System.out.print("Input y: ");
		y = ConsoleReader.getDouble();
		System.out.println("Result = "+ExpressionCalculator.calculate(x, y));
	}
}

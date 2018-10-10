package by.bsuir.Kaminsky.task3;

import java.util.Map;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){	
        
		System.out.print("Input begin value: ");
		double a = ConsoleReader.GetDouble();
		System.out.print("Input end value: ");
		double b = ConsoleReader.GetDouble();
		System.out.print("Input step: ");
		double h = ConsoleReader.GetDouble();
		Map<Double, Double> map = FunctionValuesOnSegmentCalculator.CalculateValuesOnSegment(a,b,h);
        int count =  map.size();
        for (int i = 0; i<count;i++)
        	System.out.println(map.values().toArray()[i]);		
	}
}

package by.bsuir.Kaminsky.task3;

import java.util.Map;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){        
		double a,b,h;
		Map<Double, Double> map;
		int count;
		
		System.out.print("Input begin value: ");
		a = ConsoleReader.getDouble();
		System.out.print("Input end value: ");
		b = ConsoleReader.getDouble();
		System.out.print("Input step: ");
		h = ConsoleReader.getDouble();
		map = FunctionValuesOnSegmentCalculator.calculateValuesOnSegment(a,b,h);
        count =  map.size();
        for (int i = 0; i<count;i++)
        	System.out.println(map.values().toArray()[i]);		
	}
}

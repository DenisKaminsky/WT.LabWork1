package by.bsuir.Kaminsky.task3;

import java.util.Map;
import java.util.TreeMap;

public class FunctionValuesOnSegmentCalculator {
	
	public static double Tg(double x) {
		return Math.sin(x)/Math.cos(x);
	}
	
	public static Map<Double,Double> CalculateValuesOnSegment(double a,double b,double h) {
		Map<Double, Double> map = new TreeMap<>();
		while (a<=b)
		{			
			map.put(a,Tg(a));
			a+=h;
		}		
		return map;		
	}
}

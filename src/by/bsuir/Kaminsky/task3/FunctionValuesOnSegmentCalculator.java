package by.bsuir.Kaminsky.task3;

import java.util.Map;
import java.util.TreeMap;

public class FunctionValuesOnSegmentCalculator {
	
	public static double tg(double x) {
		return Math.sin(x)/Math.cos(x);
	}
	
	public static Map<Double,Double> calculateValuesOnSegment(double a,double b,double h) {
		Map<Double, Double> map = new TreeMap<>();
		
		while (a<=b)
		{			
			map.put(a,tg(a));
			a+=h;
		}		
		return map;		
	}
}

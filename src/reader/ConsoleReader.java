package reader;

import java.util.Scanner;

public class ConsoleReader {
	
	private static Scanner in = new Scanner(System.in);
	
	public static double GetDouble()
	{
		while (!in.hasNextDouble()) {
			in.next();			
		}
		return in.nextDouble();
	}
	
	public static int GetInteger()
	{
		while (!in.hasNextInt())
		{
			in.next();
		}
		return in.nextInt();
	}
	
	public static int GetPostitveInteger()
	{
		int num;
		do {
			num = GetInteger();
		}while (num < 0);
		return num;
	}
	
	public static String GetString()
	{
		return in.next();
	}
	
	public static int[] GetIntegerArray(int count)
	{
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i]= GetInteger();
		}
		return array;
	}
	
	public static double[] GetDoubleArray(int count)
	{
		double[] array = new double[count];
		for (int i = 0; i < count; i++) {
			array[i]= GetDouble();
		}
		return array;
	}
}

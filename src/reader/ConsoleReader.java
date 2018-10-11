package reader;

import java.util.Scanner;

public class ConsoleReader {
	
	private static Scanner in = new Scanner(System.in);
	
	public static double getDouble() {
		while (!in.hasNextDouble()) {
			in.next();			
		}
		return in.nextDouble();
	}
	
	public static int getInteger()	{
		while (!in.hasNextInt())  {
			in.next();
		}
		return in.nextInt();
	}
	
	public static void fflush() {
		in.nextLine();
	}
	
	public static int getPostitveInteger()	{
		int num;
		
		do {
			num = getInteger();
		}while (num < 0);
		return num;
	}
	
	public static String getString() {
		return in.nextLine();
	}
	
	public static int[] getIntegerArray(int count)	{
		int[] array = new int[count];
		
		for (int i = 0; i < count; i++) {
			array[i]= getInteger();
		}
		return array;
	}
	
	public static double[] getDoubleArray(int count) {
		double[] array = new double[count];
		
		for (int i = 0; i < count; i++) {
			array[i]= getDouble();
		}
		return array;
	}
}

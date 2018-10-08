package by.bsuir.Kaminsky.task4;

import java.util.ArrayList;

public class PrimeNumbersVerifier {
	private static boolean IsPrime(int number)
	{
		if (number < 2)
			return false;
		
		int ceilNum = (int)Math.round(Math.sqrt(number));
		
		for(int i=2;i<=ceilNum;i++)
			if(number%i==0)
				return false;

        return true;
	}
	
	public static ArrayList<Integer> FindSimpleNumberIndex(int[] mass)
	{
		ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < mass.length; i++){
            if (IsPrime(mass[i])){
                result.add(i);
            }
        }
        return result;
	}
	
	public static void main(String ... args){
        int[] mass = new int[] {1,2,3,4,5,6,7,8,9,10,11};
        ArrayList<Integer> list = FindSimpleNumberIndex(mass);
        System.out.println(list);
	}
}

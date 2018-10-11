package by.bsuir.Kaminsky.task4;

import java.util.ArrayList;

public class PrimeNumbersVerifier {
	
	private static boolean isPrime(int number) {
		int ceilNum;
		
		if (number < 2)
			return false;		
		ceilNum = (int)Math.round(Math.sqrt(number));		
		for(int i=2;i<=ceilNum;i++)
			if(number%i==0)
				return false;
        return true;
	}
	
	public static ArrayList<Integer> findPrimeNumberIndex(int[] mass) {
		ArrayList<Integer> result = new ArrayList<>();
		
        for (int i = 0; i < mass.length; i++){
            if (isPrime(mass[i])){
                result.add(i);
            }
        }
        return result;
	}
}

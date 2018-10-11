package by.bsuir.Kaminsky.task4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task4.PrimeNumbersVerifier;
import java.util.ArrayList;
import java.util.Arrays;

class PrimeNumbersVerifierTest {

	private int[] mass;
	private ArrayList<Integer> actual;
	
	@Test
	void EmptyArrayTest() {
		mass = new int[] {};
		actual = PrimeNumbersVerifier.findPrimeNumberIndex(mass);
		assertEquals(0,actual.size());		
	}
	
	@Test
	void WithoutPrimeNumbersTest() {
		mass = new int[] {0,1,4,6,8,9,10,12,14,15};
		actual = PrimeNumbersVerifier.findPrimeNumberIndex(mass);
		assertEquals(0,actual.size());		
	}
	
	@Test
	void FindPrimeNumbersTest() {			
		mass = new int[] {2,4,5,8,9,10,11,13,15,17};
		actual = PrimeNumbersVerifier.findPrimeNumberIndex(mass);
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0,2,6,7,9));
		assertEquals(5,actual.size());
		assertArrayEquals(expected.toArray(),actual.toArray());		
		
	}

}

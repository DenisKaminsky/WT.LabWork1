package by.bsuir.Kaminsky.task4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task4.PrimeNumbersVerifier;
import java.util.ArrayList;
import java.util.Arrays;

class PrimeNumbersVerifierTest {

	@Test
	void FindSimpleNumberIndexTest() {
		int[] mass = new int[] {};
		ArrayList<Integer> list = PrimeNumbersVerifier.FindSimpleNumberIndex(mass);
		assertEquals(list.size(), 0);
		
		mass = new int[] {0,1,4,6,8,10,12,14,15};
		list = PrimeNumbersVerifier.FindSimpleNumberIndex(mass);
		assertEquals(list.size(), 0);
		
		mass = new int[] {2,4,5,8,9,10,11,13,15,17};
		list = PrimeNumbersVerifier.FindSimpleNumberIndex(mass);
		ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(0,2,6,7,9));
		assertEquals(list.size(), 5);
		assertArrayEquals(list.toArray(),expectedList.toArray());	
		
	}

}

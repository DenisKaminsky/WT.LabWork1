package by.bsuir.Kaminsky.task5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import by.bsuir.Kaminsky.task5.MaxIncreasingSequence;

class MaxIncreasingSequenceTest {

	private int[] mass;
	
	@Test
	void IncreasingSequenceTest() {
		mass = new int[] {1,2,3,4,5,6,7,8,9};
		assertEquals(0, MaxIncreasingSequence.findMinCountExtraItems(mass));
	}
	
	@Test
	void DescendingSequenceTest() {
		mass = new int[] {6,5,4,3,2,1};
		assertEquals(5, MaxIncreasingSequence.findMinCountExtraItems(mass));
	}
	
	@Test
	void MonotoneSequenceTest() {
		mass = new int[] {5,5,5,5,5};
		assertEquals(4, MaxIncreasingSequence.findMinCountExtraItems(mass));
	}
	
	@Test
	void RandonSequenceTest1() {
		mass = new int[] {5,4,3,4,2};
		assertEquals(3, MaxIncreasingSequence.findMinCountExtraItems(mass));
	}
	
	@Test
	void RandonSequenceTest2() {
		mass = new int[] {1,2,0,4,5};
		assertEquals(1, MaxIncreasingSequence.findMinCountExtraItems(mass));
	}
	
	@Test
	void RandonSequenceTest3() {
		mass = new int[] {9,3,1,2,6};
		assertEquals(2, MaxIncreasingSequence.findMinCountExtraItems(mass));
	}

}

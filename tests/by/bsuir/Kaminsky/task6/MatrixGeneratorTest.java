package by.bsuir.Kaminsky.task6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task6.MatrixGenerator;

class MatrixGeneratorTest {

	private double[] array;
	private double[][] actual;
	private double[][] expected;
	
	@Test
	void EmptyArrayTest() {
		array = new double[] {};
		actual = MatrixGenerator.GenerateMatrix(array);
		assertEquals(0,actual.length);
	}
	
	@Test
	void SingleElementTest() {
		array = new double[] {1};
		expected = new double[][] { {1} };
		actual = MatrixGenerator.GenerateMatrix(array);
		assertEquals(1,actual.length);
		assertEquals(1,actual[0].length);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void MultipleElementsTest() {
		array = new double[] {1,2,3,4,5};
		expected = new double[][] { {1,2,3,4,5} , {2,3,4,5,1} , {3,4,5,1,2} , {4,5,1,2,3} , {5,1,2,3,4} };
		actual = MatrixGenerator.GenerateMatrix(array);
		assertEquals(5,actual.length);
		assertEquals(5,actual[0].length);
		assertArrayEquals(expected, actual);		
	}

}

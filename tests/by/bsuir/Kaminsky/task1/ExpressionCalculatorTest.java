package by.bsuir.Kaminsky.task1;

import by.bsuir.Kaminsky.task1.ExpressionCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExpressionCalculatorTest {

	@Test
	void CalculateTest() {
		double expected;
		
		assertEquals(0.5, ExpressionCalculator.calculate(0, 0));
        assertEquals(-0.5, ExpressionCalculator.calculate(-1, 1));
        expected = (1.0/(7 - 10.0/626)) + 5;
        assertEquals(expected, ExpressionCalculator.calculate(5, -5));
	}

}

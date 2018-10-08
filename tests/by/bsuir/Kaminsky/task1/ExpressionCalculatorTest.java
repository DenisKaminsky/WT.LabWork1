package by.bsuir.Kaminsky.task1;

import by.bsuir.Kaminsky.task1.ExpressionCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExpressionCalculatorTest {

	@Test
	void CalculateTest() {
		assertEquals(0.5, ExpressionCalculator.Calculate(0, 0));
        assertEquals(-0.5, ExpressionCalculator.Calculate(-1, 1));
        double expected = (1.0/(7 - 10.0/626)) + 5;
        assertEquals(expected, ExpressionCalculator.Calculate(5, -5));
	}

}

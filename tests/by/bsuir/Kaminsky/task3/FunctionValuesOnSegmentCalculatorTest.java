package by.bsuir.Kaminsky.task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task3.FunctionValuesOnSegmentCalculator;
import java.util.Map;

class FunctionValuesOnSegmentCalculatorTest {

	@Test
	void CalculateValuesOnSegmentTest() {
		Map<Double, Double> map = FunctionValuesOnSegmentCalculator.calculateValuesOnSegment(0, 1, 0.25);
		
        assertEquals(5, map.size());
        assertTrue(map.get(0.0) == 0.0);
        assertTrue(Math.abs(map.get(0.25) - 0.255) <= 0.01 );  
        
        map = FunctionValuesOnSegmentCalculator.calculateValuesOnSegment(-5, 5, 0.5);
        assertEquals(21, map.size());
        assertTrue(Math.abs(map.get(-5.0) - 3.380) <= 0.01 );
        assertTrue(Math.abs(map.get(3.5) - 0.374) <= 0.01 );  
	}

}

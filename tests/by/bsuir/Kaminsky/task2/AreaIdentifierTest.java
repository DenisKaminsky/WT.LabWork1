package by.bsuir.Kaminsky.task2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task2.AreaIdentifier;

class AreaIdentifierTest {

	@Test
	void IsBelongAreaTest() {
		assertTrue(AreaIdentifier.isBelongArea(0,0));
        assertTrue(AreaIdentifier.isBelongArea(3,4));
        assertTrue(AreaIdentifier.isBelongArea(4,-3));
        assertFalse(AreaIdentifier.isBelongArea(-5,1));
        assertFalse(AreaIdentifier.isBelongArea(2,-4));
        assertFalse(AreaIdentifier.isBelongArea(-1,6));
	}
}

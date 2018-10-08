package by.bsuir.Kaminsky.task2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task2.AreaIdentifier;

class AreaIdentifierTest {

	@Test
	void IsBelongAreaTest() {
		assertTrue(AreaIdentifier.IsBelongArea(0,0));
        assertTrue(AreaIdentifier.IsBelongArea(3,4));
        assertTrue(AreaIdentifier.IsBelongArea(4,-3));
        assertFalse(AreaIdentifier.IsBelongArea(-5,1));
        assertFalse(AreaIdentifier.IsBelongArea(2,-4));
        assertFalse(AreaIdentifier.IsBelongArea(-1,6));
	}
}

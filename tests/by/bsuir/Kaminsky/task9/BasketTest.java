package by.bsuir.Kaminsky.task9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task9.Basket;
import by.bsuir.Kaminsky.task9.Ball;

class BasketTest {

	private Basket basket;
	
	@Test
	void GetWeightTest()
	{
		basket = new Basket(4);
		basket.add(new Ball("blue", 13.3f));
		basket.add(new Ball("red", 20));
		basket.add(new Ball("green", 30));
		assertTrue(Math.abs(basket.getWeight()-63.3)<= 0.01);
	}
	
	@Test
	void GetBlueBallsCountTest()
	{
		basket = new Basket(6);
		basket.add(new Ball("blue", 10));
		basket.add(new Ball("red", 50));
		basket.add(new Ball("green", 20));
		basket.add(new Ball("blue", 17));
		basket.add(new Ball("blue", 24));
		basket.add(new Ball("red", 12));
		assertEquals(3, basket.getBlueBallsCount());
	}
	
	@Test
	void BasketOverflowTest()
	{
		basket = new Basket(3);
		for (int i = 0; i < 5; i++) {
			basket.add(new Ball("red", 5));
		}
		assertEquals(3, basket.getBallsCount());
		assertTrue(basket.isFull());
	}
	
	@Test
	void NullPointerTest()
	{
		basket = new Basket(3);
		basket.add(null);
		basket.add(new Ball("red", 50));
		basket.add(new Ball("green", 40));
		assertEquals(2, basket.getBallsCount());
		assertFalse(basket.isFull());
	}

}

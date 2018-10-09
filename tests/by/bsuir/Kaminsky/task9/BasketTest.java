package by.bsuir.Kaminsky.task9;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import by.bsuir.Kaminsky.task9.Basket;
import by.bsuir.Kaminsky.task9.Ball;

class BasketTest {

	private Basket basket;
	
	@Test
	void GetWeightTest()
	{
		basket = new Basket(4);
		basket.Add(new Ball(Color.BLUE, 13.3f));
		basket.Add(new Ball(Color.RED, 20));
		basket.Add(new Ball(Color.GREEN, 30));
		assertTrue(Math.abs(basket.GetWeight()-63.3)<= 0.01);
	}
	
	@Test
	void GetBlueBallsCountTest()
	{
		basket = new Basket(6);
		basket.Add(new Ball(Color.BLUE, 10));
		basket.Add(new Ball(Color.RED, 50));
		basket.Add(new Ball(Color.GREEN, 20));
		basket.Add(new Ball(Color.BLUE, 17));
		basket.Add(new Ball(Color.BLUE, 24));
		basket.Add(new Ball(Color.RED, 12));
		assertEquals(3, basket.GetBlueBallsCount());
	}
	
	@Test
	void BasketOverflowTest()
	{
		basket = new Basket(3);
		for (int i = 0; i < 5; i++) {
			basket.Add(new Ball(Color.RED, 5));
		}
		assertEquals(3, basket.GetBallsCount());
		assertTrue(basket.IsFull());
	}
	
	@Test
	void NullPointerTest()
	{
		basket = new Basket(3);
		basket.Add(null);
		basket.Add(new Ball(Color.RED, 50));
		basket.Add(new Ball(Color.GREEN, 40));
		assertEquals(2, basket.GetBallsCount());
		assertFalse(basket.IsFull());
	}

}

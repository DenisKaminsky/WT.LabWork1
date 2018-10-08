package by.bsuir.Kaminsky.task9;

import java.awt.Color;

public class Main {

	public static void main(String... args) {
		Basket basket = new Basket(4);
		basket.Add(new Ball(Color.BLUE, 13.3f));
		basket.Add(new Ball(Color.BLUE, 20));
		basket.Add(new Ball(Color.BLUE, 50));
		basket.Add(new Ball(Color.RED, 5));
		System.out.println("Blue balls count: "+basket.GetBlueBallsCount());
		System.out.println("Balls weight: "+basket.GetWeight());
		System.out.println("Basket is full: "+basket.IsFull());
    }
}

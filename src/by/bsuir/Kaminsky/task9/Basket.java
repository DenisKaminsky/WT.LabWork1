package by.bsuir.Kaminsky.task9;

import java.awt.Color;
import java.util.ArrayList;

public final class Basket {
	private int capacity;
	private ArrayList<Ball> balls;
	
	public Basket(int capacity)
	{
		this.capacity = capacity;
		balls = new ArrayList<Ball>();
	}
	
	public double GetWeight()
	{
		double weight = 0;
		for (Ball ball : balls) {
			weight+=ball.GetWeight();
		}
		return weight;
	}
	
	public int GetBlueBallsCount()
	{
		int count = 0;
		for (Ball ball : balls) {
			if (ball.GetColor() == Color.BLUE)
				count++;
		}
		return count;
	}
	
	public boolean IsFull()
	{
		if (balls.size() == capacity)
			return true;
		return false;
	}
	
	public boolean Add(Ball ball)
	{
		if (!IsFull())
		{
			balls.add(ball);
			return true;
		}
		return false;
	}
}
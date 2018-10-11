package by.bsuir.Kaminsky.task9;

import java.util.ArrayList;

public final class Basket {
	private int capacity;
	private ArrayList<Ball> balls;
	
	public Basket(int capacity)	{
		this.capacity = capacity;
		balls = new ArrayList<Ball>();
	}
	
	public int getBallsCount() {
		return balls.size();
	}
	
	public double getWeight() {
		double weight = 0;
		
		for (Ball ball : balls) {
			weight+=ball.getWeight();
		}
		return weight;
	}
	
	public int getBlueBallsCount() {
		int count = 0;
		
		for (Ball ball : balls) {
			if (ball.getColor().equals("blue"))
				count++;
		}
		return count;
	}
	
	public boolean isFull()	{
		if (balls.size() == capacity)
			return true;
		return false;
	}
	
	public boolean add(Ball ball) {
		if (ball != null && !isFull()) {
			balls.add(ball);
			return true;
		}
		return false;
	}
}

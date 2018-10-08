package by.bsuir.Kaminsky.task9;

import java.awt.Color;

public final class Ball {
	private Color color;
	private double weigth;
	
	public Ball(Color color, double weight)
	{
		this.color = color;
		this.weigth = weight;
	}
	
	public double GetWeight()
	{
		return weigth;
	}
	
	public Color GetColor()
	{
		return color;
	}	
}

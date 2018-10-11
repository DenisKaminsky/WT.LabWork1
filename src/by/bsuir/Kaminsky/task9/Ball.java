package by.bsuir.Kaminsky.task9;

public final class Ball {
	private String color;
	private double weigth;
	
	public Ball(String color, double weight) {
		this.color = color.toLowerCase();
		this.weigth = weight;
	}
	
	public double getWeight() {
		return weigth;
	}
	
	public String getColor() {
		return color;
	}	
}

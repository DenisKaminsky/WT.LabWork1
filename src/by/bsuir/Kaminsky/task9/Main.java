package by.bsuir.Kaminsky.task9;

import reader.ConsoleReader;

public class Main {

	public static void main(String... args) {
		
		//javac -sourcepath ./src -d bin src/by/bsuir/Kaminsky/task9/Main.java
		//java -classpath ./bin by.bsuir.Kaminsky.task9.Main
		int count;
		String color;
		Basket basket;
		double weight;
		
		System.out.print("Input basket capacity: ");
		count = ConsoleReader.getPostitveInteger();
		basket = new Basket(count);
		while (!basket.isFull()) {
			ConsoleReader.fflush();
			System.out.print("Input color: ");
			color = ConsoleReader.getString();
			System.out.print("Input weight: ");
			weight = ConsoleReader.getDouble();
			basket.add(new Ball(color, weight));
			System.out.println();
		}
		System.out.println("Basket is full!");
		System.out.println("Balls count: "+basket.getBallsCount());
		System.out.println("Blue balls count: "+basket.getBlueBallsCount());
		System.out.println("Total weight: "+basket.getWeight());
    }
}

package by.bsuir.Kaminsky.task9;

import reader.ConsoleReader;

public class Main {

	public static void main(String... args) {
		
		//javac -sourcepath ./src -d bin src/by/bsuir/Kaminsky/task9/Main.java
		//java -classpath ./bin by.bsuir.Kaminsky.task9.Main
		System.out.print("Input basket capacity: ");
		int count = ConsoleReader.GetPostitveInteger();
		Basket basket = new Basket(count);
		String color;
		double weight;
		while (!basket.IsFull())
		{
			System.out.print("Input color: ");
			color = ConsoleReader.GetString();
			System.out.print("Input weight: ");
			weight = ConsoleReader.GetDouble();
			basket.Add(new Ball(color, weight));
			System.out.println();
		}
		System.out.println("Basket is full!");
		System.out.println("Balls count: "+basket.GetBallsCount());
		System.out.println("Blue balls count: "+basket.GetBlueBallsCount());
		System.out.println("Total weight: "+basket.GetWeight());
    }
}

package by.bsuir.Kaminsky.task2;

public class AreaIdentifier {
	
	public static boolean isBelongArea(int x, int y) {
		return ( ( (y>=0) && (y<=5) && (Math.abs(x)<=4) ) || ( (y<=0) && (y>=-3) && (Math.abs(x)<=6) ) );
	}
}


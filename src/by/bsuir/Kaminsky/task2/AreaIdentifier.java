package by.bsuir.Kaminsky.task2;

public class AreaIdentifier {
	public static boolean IsBelongArea(int x, int y)
	{
		return ( ( (y>=0) && (y<=5) && (Math.abs(x)<=4) ) || ( (y<=0) && (y>=-3) && (Math.abs(x)<=6) ) );
	}
	
	public static void main(String ... args){
		System.out.println(IsBelongArea(0,0));
	}
}


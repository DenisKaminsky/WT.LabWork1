package by.bsuir.Kaminsky.task5;

public class MaxIncreasingSequence {
	
	public static int FindMinElementsAmount(int[] array)
	{
		int min = array.length;
		for (int i= 0; i < array.length-1; i++)
		{
			int k = i;
			int elem = array[i];
			for (int j = i+1; j < array.length; j++)
			{
			    if(elem>=array[j])
			    {
			        k++;
			    }
			    else
			    {
			        elem=array[j];
			    }
			}
			if (k<min)
			{
				min = k;
			}
		}
		return min;
	}
	
	public static void main(String ... args){
		int[] mass = new int[] {1, 7, 2, 6, 5, 4, 8};
		System.out.println(FindMinElementsAmount(mass));
	}	
}

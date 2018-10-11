package by.bsuir.Kaminsky.task5;

public class MaxIncreasingSequence {
	
	public static int findMinCountExtraItems(int[] array) {
		int min = array.length;
		int k, elem;
		
		for (int i= 0; i < array.length-1; i++)	{
			k = i;
			elem = array[i];
			for (int j = i+1; j < array.length; j++) {
			    if(elem>=array[j])
			        k++;
			    else
			        elem=array[j];
			}
			if (k<min) {
				min = k;
			}
		}
		return min;
	}
}

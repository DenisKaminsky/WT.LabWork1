package by.bsuir.Kaminsky.task7;

public class ShellSort {
	private static double[] Sort(double[] array)
    {
        int step = array.length/2;
        while (step > 0)
        {
            int i, j;
            for (i = step; i < array.length; i++)
            {
                double value = array[i];
                for (j = i - step; (j >= 0) && (array[j] > value); j -= step)
                    array[j + step] = array[j];
                array[j + step] = value;
            }
            step /= 2;
        }
        return array;
    }
	
	public static void main(String ... args)
	{
		double[] arr = new double[] {32,95,16,82,24,66,35,19,75,54,40,43,93};
		for (int i = 0; i< arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr = Sort(arr);
		for (int i = 0; i< arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}

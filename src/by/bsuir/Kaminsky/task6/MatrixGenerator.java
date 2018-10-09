package by.bsuir.Kaminsky.task6;

public class MatrixGenerator {
	public static double[][] GenerateMatrix(double[] array)
	{
		int size = array.length;
		double[][] result = new double[size][size];		
		int counter = 0;
		
		for (int i = 0; i < size ; i++) 
		{
			for (int j = 0; j < size ; j++) 
			{
				result[i][j] = array[(j+counter)%size];
			}
			counter++;
		}
		
		return result;
	}
	
	public static void PrintMatrix(double[][] array)
	{
		int width = array.length;
		int height = 0;
		if (width != 0)
			height = array[0].length;
		for (int i = 0; i< height; i++)
		{
			for (int j = 0; j<width;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String ... args)
	{
		double[] arr = new double[] {1,2,3,4,5,6,7};
		double[][] result = GenerateMatrix(arr);
		PrintMatrix(result);
	}
}

package by.bsuir.Kaminsky.task7;

public class ShellSort {
	
	public static double[] Sort(double[] array) {
        int step = array.length/2;
        while (step > 0) {
            int i, j;
            for (i = step; i < array.length; i++) {
                double value = array[i];
                for (j = i - step; (j >= 0) && (array[j] > value); j -= step)
                    array[j + step] = array[j];
                array[j + step] = value;
            }
            step /= 2;
        }
        return array;
    }	
}

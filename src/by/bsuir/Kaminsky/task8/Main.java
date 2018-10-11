package by.bsuir.Kaminsky.task8;

import reader.ConsoleReader;

public class Main {
	public static void main(String ... args){
		int count;
		int[] A,B;
		
		System.out.print("Input array A numbers count: ");
		count = ConsoleReader.getPostitveInteger();
		System.out.println("Input array A: ");
		A = ConsoleReader.getIntegerArray(count);
		System.out.print("Input array B numbers count: ");
		count = ConsoleReader.getPostitveInteger();
		System.out.println("Input array B: ");
		B = ConsoleReader.getIntegerArray(count);
		System.out.println(SequencesLinker.joinSequences(A, B));
		//A = {1,1,3,5,5,7};
        //B = {2,3,4,6,6,7};
	}
}

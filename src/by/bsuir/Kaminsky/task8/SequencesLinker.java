package by.bsuir.Kaminsky.task8;

import java.util.ArrayList;

public class SequencesLinker {

	public static ArrayList<Integer> joinSequences(int [] seqA, int [] seqB){
        ArrayList<Integer> indexes = new ArrayList<>();
        int j = 0;
        
        for (int i = 0; i < seqB.length; i++){
            while (j < seqA.length){
                if (seqA[j] <= seqB[i]){
                    j++;
                }
                else break;
            }
            indexes.add(i+j);
        }
        return indexes;
    }
}

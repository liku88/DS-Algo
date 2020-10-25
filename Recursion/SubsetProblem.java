package in.mangaldeep;

import java.util.Scanner;

public class SubsetProblem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String currentSubset = "";
        int index = 0;
        subSets(word,currentSubset,index);
    }

    private static void subSets(String word, String currentSubset, int index) {
        if(index == word.length()){
            System.out.print(currentSubset+" ");
            return;
        }
        subSets(word,currentSubset,index+1);
        subSets(word,currentSubset+word.charAt(index), index+1);
    }


}



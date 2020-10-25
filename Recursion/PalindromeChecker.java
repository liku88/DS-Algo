package in.mangaldeep;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int start = 0;
        int end = word.length()-1;
        boolean check = checker(word, start, end);
        System.out.println(check);
    }

    private static boolean checker(String word, int start, int end) {
        if(start>=end){
            return true;
        }
        return (word.charAt(start)==word.charAt(end)&&checker(word, start+1, end-1));
    }


}

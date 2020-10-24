package in.mangaldeep;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.print(sum);
    }

    private static int sumOfNaturalNumbers(int n) {
        if(n == 0){
            return  0;
        }
        return n + sumOfNaturalNumbers(n-1);
    }
}

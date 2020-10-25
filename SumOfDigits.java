package in.mangaldeep;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = sumOfDigits(n);
        System.out.println(sum);
    }

    private static long sumOfDigits(long n) {
        if(n == 0){
            return 0;
        }
        return sumOfDigits(n/10) + n%10;
    }
}

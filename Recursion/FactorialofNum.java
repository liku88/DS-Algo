package in.mangaldeep;

import java.util.Scanner;

public class FactorialofNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long fact = factorialOfN(n);
        System.out.print(fact);

    }

    private static long factorialOfN(long n) {
        if(n == 0){
            return 1;
        }
        return n*factorialOfN(n-1);
    }
}

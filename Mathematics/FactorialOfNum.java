package in.mangaldeep;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long fact = factTorial(n);
        System.out.println(fact);
    }

    private static long factTorial(long n) {
        long fact = 1;
        for(int i =2; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
}

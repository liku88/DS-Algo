package in.mangaldeep;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = gcdCalculator(a,b);
        System.out.println(gcd);
    }

    private static int gcdCalculator(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcdCalculator(b, a%b);
    }
}

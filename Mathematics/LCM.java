package in.mangaldeep;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int lcm = lcmCal(a, b);
        System.out.println(lcm);
    }

    private static int lcmCal(int a, int b) {
        int gcd = gcdCal(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }

    private static int gcdCal(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcdCal(b, a%b);
    }
}

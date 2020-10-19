package in.mangaldeep;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean answer = checkerPowerTwo(n);
        System.out.println(answer);
    }

    private static boolean checkerPowerTwo(int n) {
        if(n == 0){
            return false;
        }
        return ((n & n-1 )== 0);
    }
}

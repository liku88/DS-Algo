package in.mangaldeep;

import java.util.Scanner;

public class TrailingZerosFactorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for(int i = 5; i<=n; i=i*5){
         result = result + n/i;
        }
        System.out.println(result);
    }
}

//3628800

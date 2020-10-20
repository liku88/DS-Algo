package in.mangaldeep;

import java.util.Scanner;

public class SwapNums {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
         a = a ^ b;
         b = a ^ b;
         a = a ^ b;
        System.out.print("a : "+a+" "+"b : "+b);
    }
}

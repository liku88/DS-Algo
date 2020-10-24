package in.mangaldeep;

import java.util.Scanner;

public class Print1toNandNto1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print1ToN(n);
        printNto1(n);
    }

    private static void print1ToN(int n) {
        if(n == 0){
            return ;
        }
        print1ToN(n-1);
        System.out.print(n+" ");
    }
    private  static void printNto1(int n){

        if(n ==0){
            return;
        }

        System.out.print(n+" ");
        printNto1(n-1);
    }
}

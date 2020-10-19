package in.mangaldeep;

import java.util.Scanner;

public class Odd_Even_Checker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        if((n ^ 1) == n+1){
//           System.out.print("even");
//        }else{
//            System.out.println("odd");
//        }
        int rS = n & (~(n-1));
        if(rS == 1){
            System.out.println("Odd");
        }else{
            System.out.println("even");
        }
    }
}

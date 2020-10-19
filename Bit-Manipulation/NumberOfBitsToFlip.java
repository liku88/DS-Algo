package in.mangaldeep;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class NumberOfBitsToFlip {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;
        int t = in.nextInt();
        for(int i =0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            int xor = a ^ b;
            while(xor>0){
                xor =  (xor & (xor - 1));
                count++;
            }

        }
        System.out.print(count);
    }
}

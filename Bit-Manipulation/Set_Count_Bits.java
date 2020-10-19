package in.mangaldeep;

import java.util.Scanner;
public class Set_Count_Bits {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int countbits = countSetBits(n);
        System.out.println(countbits);
    }
//    Naive method
//    private static int countSetBits(int n) {
//        int count = 0;
//        while(n>0){
//            if(n % 2 != 0){
//                count++;
//            }
//            n = n/2;
//        }
//        return count;
//    }

//    By Kerningam's method more opotimized

    private static int countSetBits(int n){
        int count = 0;
        while(n>0){
            n = (n & (n-1));
            count++;
        }
        return  count;

    }


}

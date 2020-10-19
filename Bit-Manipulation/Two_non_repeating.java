package in.mangaldeep;

import java.util.Scanner;

public class Two_non_repeating {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[2*n+2];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
       twoNonRepeating(arr);

    }

    private static void twoNonRepeating(int[] arr) {
        int res1 =0, res2 =0, xor =0;
        for(int i = 0; i<arr.length; i++){
            xor = xor ^ arr[i];          //Finding the xor of element
        }
        int rS = xor & (~(xor-1));      //Finding the rightmost setbit of the xor
        for(int i = 0; i<arr.length; i++){
            if((arr[i] & rS) != 0){
                res1 = res1 ^ arr[i];   //First set where it contains setbits in rightmost postion
            }else{
                res2 = res2 ^ arr[i];   //First set where it does not contains setbits in rightmost postion
            }
        }
        System.out.println(res1+" "+res2);
    }


}

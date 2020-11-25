package in.mangaldeep;

import java.util.ArrayList;
import java.util.Scanner;

public class NonZero {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        nonZero(arr,n);
    }

    private static void nonZero(int[] arr, int n) {
     int temp[] = new int[n];
     int count = 0;

     for(int i = 0; i<n; i++){
         if(arr[i] != 0){
             temp[count] = arr[i];
             count++;
         }
     }
     for(int i = 0; i<count; i++){
         System.out.print(temp[i] +" ");
     }
    }
}

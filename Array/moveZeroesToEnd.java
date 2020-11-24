package in.mangaldeep;

import java.util.Scanner;

public class moveZeroesToEnd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }
        arrayAfterMovingZeroesToEnd(arr, n);

    }

    private static void arrayAfterMovingZeroesToEnd(int[] arr, int n) {
     int temp = 0;
     int count = 0;
     for(int i = 0; i<n; i++){
         if(arr[i] != 0){
             temp = arr[count];
             arr[count] = arr[i];
             arr[i] = temp;
             count++;
         }

     }
     for(int i = 0; i<n; i++){
         System.out.print(arr[i] +" ");
     }
    }

}

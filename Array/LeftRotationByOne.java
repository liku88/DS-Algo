package in.mangaldeep;

import java.util.Scanner;

public class LeftRotationByOne {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        leftRotateByone(arr,n);
    }

    private static void leftRotateByone(int[] arr, int n) {
        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
}

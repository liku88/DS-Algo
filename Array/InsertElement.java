package in.mangaldeep;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int capacity = in.nextInt();
        int arr[] = new int[capacity];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int position = in.nextInt();
        int insertElement = in.nextInt();

        insertedArray(arr,n,capacity,position,insertElement);

    }

    private static void insertedArray(int[] arr, int n, int capacity, int position, int insertElement) {
        int i = position-1;
        if(n == capacity){
            for(int j = 0; i<n; j++){
                System.out.print(arr[j] +" ");
            }
        }
        for(int j = n-1; j>=i; j--){
            arr[j+1] = arr[j];
        }
        arr[i] = insertElement;

        for(int k = 0; k<n+1; k++){
            System.out.print(arr[k] +" ");
        }
    }
}

package in.mangaldeep;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int secondLargest = secondLargestFun(arr);
        System.out.println(secondLargest);
    }

    private static int secondLargestFun(int[] arr) {
        int max = arr[0];
        int temp = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i] > temp && arr[i] < max){
                temp = arr[i];
            }
        }
       return temp;

    }
}

package in.mangaldeep;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = in.nextInt();
        }
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int l = 0;
        int h = arr.length -1;
        int temp = 0;
        while(l < h){
            temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
}

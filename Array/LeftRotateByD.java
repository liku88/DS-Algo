package in.mangaldeep;

import java.util.Scanner;

public class LeftRotateByD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        leftRotateByD(arr,n,d);

    }

    private static void leftRotateByD(int[] arr, int n, int d) {
        int temp[] = new int[d];
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        for (int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i<d; i++){
            arr[n-d+i] = temp[i];
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
}

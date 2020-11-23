package in.mangaldeep;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Intial Array :-");
        System.out.println();
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        newArray(arr,n);
    }

    private static void newArray(int[] arr, int n) {
        int temp = 1;
        for(int i = 1; i<n; i++) {
            if (arr[i] != arr[temp - 1]) {
                arr[temp] = arr[i];
                temp++;
            }
        }
            for(int i = 0; i<temp; i++){
                System.out.print(arr[i] +" ");
            }

    }
}

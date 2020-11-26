package in.mangaldeep;

import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        leaderInArr(arr,n);
    }

    private static void leaderInArr(int[] arr, int n) {

       int finalNum = arr[n-1];
        System.out.print(finalNum+" ");
        for(int i = n-2; i>=0; i--){
            if(arr[i] > finalNum){
                finalNum = arr[i];
                System.out.print(finalNum +" ");
            }
        }

    }
}

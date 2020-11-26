package in.mangaldeep;

import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int res = MaxDifference(arr,n);
        System.out.println(res);
    }

    private static int MaxDifference(int[] arr, int n) {
        int res = arr[1] - arr[0];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                res = Math.max(res, (arr[j]-arr[i]));
            }
        }
        return res;
    }
}

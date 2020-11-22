package in.mangaldeep;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int largestElement = largestFun(arr);
        System.out.print(largestElement);
    }

    private static int largestFun(int[] arr) {
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

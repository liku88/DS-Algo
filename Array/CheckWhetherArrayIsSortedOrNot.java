package in.mangaldeep;

import java.util.Scanner;

public class CheckWhetherArrayIsSortedOrNot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        boolean isSorted = isSortedFun(arr);
        System.out.println(isSorted);
    }

    private static boolean isSortedFun(int[] arr) {
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}

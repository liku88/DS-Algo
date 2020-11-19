package in.mangaldeep;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int targetElement = in.nextInt();
        int indexOfTargetElement = indexTargetElement(arr, n, targetElement);
        System.out.println(indexOfTargetElement);

    }

    private static int indexTargetElement(int[] arr, int n, int targetElement) {
        for(int i = 0; i<n; i++){
            if(arr[i] == targetElement){
                return i;
            }
        }
        return -1;
    }
}

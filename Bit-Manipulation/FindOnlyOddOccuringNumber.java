package in.mangaldeep;

import java.util.Scanner;

public class FindOnlyOddOccuringNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int result = findOddOccuring(arr, n);
        System.out.print(result);
    }

    private static int findOddOccuring(int[] arr, int n) {
        int xor = 0;
        for(int i = 0; i<n;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}

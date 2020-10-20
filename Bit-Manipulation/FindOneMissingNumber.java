package in.mangaldeep;

import java.util.Scanner;

public class FindOneMissingNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int missing = missingNumber(arr, n);
        System.out.print(missing);
    }

    private static int missingNumber(int[] arr, int n) {
        int xor = arr[0];
        int xor1 = 1;
        for(int i = 1; i<n; i++){
            xor = xor ^ arr[i];
        }
        for (int i = 2; i<=n+1; i++){
            xor1 = xor1 ^ i;
        }
        return( xor ^ xor1);

    }
}

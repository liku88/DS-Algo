package in.mangaldeep;

import java.util.Scanner;

public class BinarySearchIterartive {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int x = in.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int targetElementPosition = findElementPosition(arr,n,x);
        System.out.println(targetElementPosition);
    }

    private static int findElementPosition(int[] arr, int n, int x) {
        int l = 0;
        int h = n-1;
        while(l<= h){
            int mid  = (l + h)/2;
            if(arr[mid] == x){
                return mid;
            }else if(x<arr[mid]){
                h = mid-1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}

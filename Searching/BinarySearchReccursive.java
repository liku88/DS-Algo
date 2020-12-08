package in.mangaldeep;

import java.util.Scanner;

public class BinarySearchReccursive {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        int l = 0;
        int h = n-1;
        int targetElementPosition = findPositionOfTargetElement(arr,l,h,x);
        System.out.println(targetElementPosition);
    }

    private static int findPositionOfTargetElement(int[] arr, int l, int h , int x) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x){
            return mid;
        }else if(x<arr[mid]){
            h = mid -1;
           return findPositionOfTargetElement(arr, l, h, x);
        }else{
            l = mid + 1;
           return findPositionOfTargetElement(arr,l,h,x);
        }


    }
}

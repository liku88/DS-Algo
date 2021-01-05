package in.mangaldeep;

import java.util.Scanner;

public class CountOccuranceInSorted {
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
        int count = countOccurance(arr,l,h,x);
        System.out.println(count);
    }

    private static int countOccurance(int[] arr, int l, int h, int x) {
        int firstOccur = firstOccurance(arr,l,h,x);
        if(firstOccur == -1){
            return 0;
        }else{
            return (lastOccurance(arr,l,h,x) -firstOccur +1);
        }
    }

    private static int lastOccurance(int[] arr, int l, int h, int x) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x){
            if(mid == h-1 || arr[mid+1] != arr[mid]){
                return mid;
            }else{
                return lastOccurance(arr,mid+1,h,x);
            }
        }else if(arr[mid] > x){
            return lastOccurance(arr,l,mid-1,x);
        }else{
            return lastOccurance(arr,mid+1,h,x);
        }
    }

    private static int firstOccurance(int[] arr, int l, int h, int x) {
        if(l>h){
            return -1;
        }
        int mid  = (l+h)/2;
        if(arr[mid] == x){
            if(mid == 0 || arr[mid-1] != arr[mid]){
                return mid;
            }else{
                return firstOccurance(arr, l, mid-1,x);
            }
        }else if(arr[mid] > x){
            return firstOccurance(arr,l,mid-1,x);
        }else{
            return firstOccurance(arr,mid+1,h,x);
        }
    }
}

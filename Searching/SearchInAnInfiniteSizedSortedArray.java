package in.mangaldeep;

import java.util.Scanner;

public class SearchInAnInfiniteSizedSortedArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int targetElement = in.nextInt();
        int search = searchFun(arr, targetElement);
        System.out.println(search);
    }

    private static int searchFun(int[] arr, int targetElement) {
        if(arr[0] == targetElement){
            return 0;
        }
        int i = 1;
        while(arr[i]<targetElement){
            i = i*2;
            if(arr[i] == targetElement){
                return i;
            }
        }
        return binarySearch(arr, i/2+1,i-1,targetElement);
    }

    private static int binarySearch(int[] arr, int i, int i1, int targetElement) {
        if (i > i1) {
            return -1;
        }
        int mid = (i + i1) / 2;
        if(arr[mid] == targetElement){
            return mid;
    }else if(arr[i] > targetElement){
            return binarySearch(arr,i,mid-1,targetElement);
        }else{
            return binarySearch(arr,mid+1,i1,targetElement);
        }
    }
}

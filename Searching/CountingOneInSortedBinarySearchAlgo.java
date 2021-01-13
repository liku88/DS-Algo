package in.mangaldeep;

import java.util.Scanner;

public class CountingOneInSortedBinarySearchAlgo {
 public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int arr[] = new int[n];
     for(int i = 0; i<n; i++){
         arr[i] = in.nextInt();
     }
     int l = 0;
     int h = n-1;
     int countOne = OccOfOne(arr,l,h);
     System.out.println(countOne);
 }

    private static int OccOfOne(int[] arr, int l, int h) {

     int firstOcc = firstOccurance(arr, l , h);

     if(firstOcc == -1){
         return  0;
     }else{
         return (lastOccurance(arr, l ,h) - firstOcc + 1);
     }
    }

    private static int lastOccurance(int[] arr, int l, int h) {
       if(l>h){
           return -1;
       }
       int mid = (l+h) / 2;
       if(arr[mid] == 1){
           if(mid == h || arr[mid] != arr[mid + 1]){
               return mid;
           }else{
               return lastOccurance(arr,mid+1,h);
           }
       }else if (arr[mid] > 1){
           return lastOccurance(arr,l,mid-1);
       }else{
           return lastOccurance(arr,mid+1,h);
       }
    }

    private static int firstOccurance(int[] arr, int l, int h) {
        if(l>h){
            return -1;
        }
        int mid  = (l+h)/2;
        if(arr[mid] == 1){
            if(mid == 0 || arr[mid - 1] != arr[mid]){
                return mid;
            }else{
                return firstOccurance(arr, l, mid-1);
            }
        }else if(arr[mid] > 1){
            return firstOccurance(arr,l,mid-1);
        }else{
            return firstOccurance(arr,mid+1,h);
        }
    }
}



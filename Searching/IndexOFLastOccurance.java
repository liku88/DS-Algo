package in.mangaldeep;

import java.util.Scanner;

public class IndexOFLastOccurance {
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
        int index = indexOfLastOcc(arr, l, h, x);
        System.out.println(index);

    }

    private static int indexOfLastOcc(int[] arr, int l, int h, int x) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == x){
            if(mid  == arr.length-1 ||arr[mid] != arr[mid+1]){
                return mid;
            }else{
                return indexOfLastOcc(arr,mid+1,h,x);
            }
        }else if (arr[mid] > x){
            return indexOfLastOcc(arr,l,mid-1,x);
        }else{
            return indexOfLastOcc(arr, mid+1, h,x);
        }
    }
}

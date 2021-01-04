package in.mangaldeep;

import java.util.Scanner;

public class IndexOfFirstOccurance {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
          arr[i] = in.nextInt();
        }

        int l = 0;
        int h = n;
        int targetElement = in.nextInt();

        int index = indexOfFirstOccurance(arr, l , h , targetElement);
        System.out.println(index);
    }

    private static int indexOfFirstOccurance(int[] arr, int l, int h, int targetElement) {
        if(l>h){
            return -1;
        }
        int mid = (l+h)/2;
        if(arr[mid] == targetElement){
            if( mid == 0 || arr[mid -1] != arr[mid] ){
                return mid;
            }else{
                return indexOfFirstOccurance(arr,l,mid-1,targetElement);
            }
        }else if(arr[mid] > targetElement){
            return indexOfFirstOccurance(arr,l,mid-1,targetElement);
        }else{
            return indexOfFirstOccurance(arr,mid+1,h,targetElement);
        }

    }
}

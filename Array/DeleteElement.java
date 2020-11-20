package in.mangaldeep;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int dltElement = in.nextInt();
       int newCapa =  newModifiedDltArray(arr, n, dltElement);
       for(int i = 0; i<newCapa; i++){
           System.out.print(arr[i] +" ");
       }
    }

    private static int newModifiedDltArray(int[] arr, int n, int dltElement) {
        int i = 0;
        for(i = 0; i<n; i++){
            if(arr[i] == dltElement){
                break;
            }
        }
        if(n == i){
            return n;
        }
        for(int j = i; j<n-1; j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }
}

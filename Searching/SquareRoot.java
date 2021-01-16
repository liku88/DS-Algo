package in.mangaldeep;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = 1;
        int h = n;
        int sqrt = SquareRootFun(n,l,h);
        System.out.println(sqrt);
    }

    private static int SquareRootFun(int n, int l, int h) {
       int ans = -1;
       while(l<=h){
           int mid = (l+h)/2;
           int midSquare = mid*mid;
           if(midSquare == n){
               return mid;
           }else if(midSquare > n){
               h = mid-1;
           }else{
               l = mid+1;
               ans = mid;
           }
       }
       return ans;


    }
}

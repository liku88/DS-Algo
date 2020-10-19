package in.mangaldeep;

import java.util.Scanner;

public class AllDivisorsOfANumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = in.nextInt();
        for( i = 1; i*i<=n; i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
        for (;  i >=1; i--){
            if(n%i ==0){
                System.out.print(n/i+" ");
            }
        }
    }
}

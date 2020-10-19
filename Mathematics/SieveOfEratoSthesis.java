package in.mangaldeep;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratoSthesis {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printPrimes(n);

    }

    private static void printPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i*i<=n; i++){
            if(issPrime(i)){
            for(int j = 2; j*j<=n; j = j+i){
                isPrime[j] = false;
            }
            }
        }
        for(int i = 2; i<=n; i++){
            if(issPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean issPrime(int i) {
        if(i == 1){
            return false;
        }
        if(i == 2 || i == 3){
            return true;
        }
        if(i%2 == 0 || i%3 ==0){
            return false;
        }
        for (int j = 5; j*j<=i; j = j + 6 ){
            if(i%j ==0 || i%(j+2) ==0){
                return false;
            }else {
                return true;
            }
        }
        return true;
    }
}

package in.mangaldeep;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        primeFac(n);
    }

    private static void primeFac(int n) {
        for(int i = 2; i<n; i++){
            if (isPrime(i)){
                int temp = i;
                while (n % temp == 0){
                    System.out.print(i+" ");
                    temp = temp * i;
                }
            }
        }
    }

    private static boolean isPrime(int i) {
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

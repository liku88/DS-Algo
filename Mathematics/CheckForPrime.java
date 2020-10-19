package in.mangaldeep;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean primeChecker = primeCheck(n);
        System.out.println(primeChecker);
    }

    private static boolean primeCheck(int n) {
        if(n == 1){
            return false;
        }
        if(n == 2 || n ==3){
            return  true;
        }
        if(n%2 == 0 || n %3 ==0){
            return false;
        }

        for (int i = 5; i*i<=n; i = i+6){
            if(n % i ==0 || n % (i+2) ==0){
                return false;
            }else {
                return true;
            }
        }
        return true;
    }
}

package in.mangaldeep;

import java.util.Scanner;

public class BinomialInRecursion {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int bino = binomialFunction(n,k);
        System.out.print(bino);
    }

    private static int binomialFunction(int n, int k) {
        if(k == 0 || n == k){
            return 1;
        }
        return binomialFunction(n-1, k-1) + binomialFunction(n-1,k);
    }
}

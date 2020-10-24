package in.mangaldeep;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        decimlToBinary(n);
    }

    private static void decimlToBinary(int n) {
        if(n == 0){
            return;
        }
        decimlToBinary(n/2);
        System.out.print(n%2);
    }
}

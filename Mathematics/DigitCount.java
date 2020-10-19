package in.mangaldeep;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long count = (long)Math.floor(Math.log10(n) + 1);
        System.out.println(count);

    }
}

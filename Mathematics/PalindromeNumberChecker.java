package in.mangaldeep;

import java.util.Scanner;

public class PalindromeNumberChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean checker = checkPalindrome(n);
        System.out.println(checker);
    }

    private static boolean checkPalindrome(int n) {
        int temp = n;
        int reverse = 0;
        int lastDigit = 0;
        while(temp>0){
            lastDigit = temp % 10;
            reverse = reverse*10 + lastDigit;
            temp = temp/10;
        }
        return (reverse == n);
    }
}

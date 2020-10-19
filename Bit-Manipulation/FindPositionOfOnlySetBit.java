package in.mangaldeep;

import java.util.Scanner;

public class FindPositionOfOnlySetBit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = positionOfOnlySetBits(n);
        System.out.println(ans);
    }

    private static int positionOfOnlySetBits(int n) {
        if(!powerOfTwo(n)){
            return -1;
        }
        int pos = (int) ((Math.log10(n & -n))/Math.log10(2)) + 1;
        return pos;
    }

    private static boolean powerOfTwo(int n) {
        if(n == 0){
            return false;
        }

        return ((n & n-1 )== 0);
    }
}

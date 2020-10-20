package in.mangaldeep;

import java.util.Scanner;

public class kthBitSetOrNot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        boolean checker = checkKBitSETorNot(n,k);
        System.out.println(checker);
    }

    private static boolean checkKBitSETorNot(int n, int k) {
        if((n&(1<<k-1))!=0){
            return true;
        }else{
            return false;
        }
    }

}

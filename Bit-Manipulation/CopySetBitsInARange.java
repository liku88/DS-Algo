package in.mangaldeep;

import java.util.Scanner;

public class CopySetBitsInARange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int left = in.nextInt();
        int right = in.nextInt();
        if(left<1 || right>32){
            return ;
        }
        int mask = (1 << (right-left+1));
        mask = mask-1;
        mask = (mask << left-1);

        mask = (mask & B);
        A = mask | A;
        System.out.println(A);
    }
}

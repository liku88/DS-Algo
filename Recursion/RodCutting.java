package in.mangaldeep;

import java.util.Scanner;

public class RodCutting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int result = maximumPieces(n,a,b,c);
        System.out.print(result);
    }

    private static int maximumPieces(int n, int a, int b, int c) {
        if(n == 0){
            return 0;
        }
        if(n <= -1){
            return -1;
        }
        int maxPiece = Math.max(maximumPieces(n-a,a,b,c),Math.max(maximumPieces(n-b,a,b,c),maximumPieces(n-c,a,b,c)));
        if(n == -1){
            return -1;
        }
        return maxPiece+1;
    }
}

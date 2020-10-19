package in.mangaldeep;

import java.util.Scanner;

public class TotalSetBits {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int result = countOfSet(n);
        System.out.print(result);
    }

    public static int countOfSet(int n) {
        if(n == 0){
            return 0;
        }
        int x = valueOfX(n);
        int f1 = (1 << (x-1)) * x;
        int f2 = n - (1 << x) + 1;
        int f3 = n - (1 << x);
        int ans =  f1 + f2 + countOfSet(f3);
        return ans;
    }

    public static int valueOfX(int n) {
        int x = 0;
        while((1 << x) <=n){
            x++;
        }
        return x - 1;
    }
}

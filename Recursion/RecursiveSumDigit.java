package in.mangaldeep;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n/10;
        }
        int z = sum*k;
       int res =  superDigit(z);
        System.out.print(res);
    }

    private static int superDigit(int z) {
        int sum = 0;
        while(z>0){
            sum += z % 10;
            z = z/10;
        }
        if(sum < 10){
            return sum;
        }else{
            return superDigit(sum);
        }
    }
}

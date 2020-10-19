package in.mangaldeep;

import java.util.Scanner;

public class ComputingThePower {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pow1 = in.nextInt();
        int power = pow(n, pow1);
        System.out.print(power);
    }

    private static int pow(int n, int pow1) {
        if(pow1  == 0){
            return 1;
        }
        int temp = pow(n , pow1/2);
        temp = temp * temp;
        if(pow1%2 == 0){
            return temp;
        }else{
            return temp * n;
        }
    }
}

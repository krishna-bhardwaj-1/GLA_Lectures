package Assignment_1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=(a<b)?a:b;
        for(int i=min;i>=1;i--){
            if(a%i==0&&b%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}

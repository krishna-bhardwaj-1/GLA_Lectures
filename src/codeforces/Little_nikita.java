package codeforces;

import java.util.Scanner;

public class Little_nikita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>=b && (a-b)%2==0) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}

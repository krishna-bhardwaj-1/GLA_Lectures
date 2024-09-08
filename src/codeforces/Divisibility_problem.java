package codeforces;

import java.util.Scanner;

public class Divisibility_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i=0;
            while (a % b != 0) {
                a += 1;
                i++;
            }
            System.out.println(i);
            n--;
        }
    }
}

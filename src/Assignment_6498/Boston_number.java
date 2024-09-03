package Assignment_6498;

import java.util.Scanner;

public class Boston_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nc=n;
        int sum=0,sm=0;
        while(nc>0){
            for(int i=2;i<=n/2;i++){
                if(nc%i==0){ sum+=i; nc/=i;}
            }
        }
        System.out.println(sum);
        while(n>0){
            int c=n%10;
            sm+=c;

            n/=10;
        }
        if(sum==sm) System.out.print(1);
        else System.out.print(0);
    }
}

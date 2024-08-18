package Assignment_1;

import java.util.Scanner;

public class Pattern_inverted_hour_glass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int spaces=2*n-1;
        while(row<=2*n+1){
            int i=1,j=1,k=5,q=k;
            //star
            int c=5;
            while(i<=star){
                System.out.print(c+" ");
                c--;
                i++;
            }
            //space
            while(j<=spaces){
                System.out.print("@ ");
                j++;
            }
            //star
            while(k>=star){
                while(q<=n){
                    System.out.print(q+" ");
                    q++;
                }
                k--;
            }
            if(row<=n) spaces-=2;
            else spaces+=2;
            if(row<=n) star++;
            else star--;
            System.out.println();
            row++;
        }
    }
}

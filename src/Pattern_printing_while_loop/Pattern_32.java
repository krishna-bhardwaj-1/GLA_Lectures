package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int val=1;
        while(row<2*n){
            int i=1;
            while(i<=star){
                if(i%2!=0) System.out.print(val+"   ");
                else System.out.print("*   ");
                i++;
            }
            if(row<n){ star+=2; val++;}
            else{ star-=2; val--;}
            System.out.println();
            row++;
        }
    }
}

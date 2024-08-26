package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=5;
        int row=1;
        while(row<=n){
            int val=n;
            int i=1;
            while(i<=star){
                if(row!=val) System.out.print(val+" ");
                else System.out.print("* ");
                val--;
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

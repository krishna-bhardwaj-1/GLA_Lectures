package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        while (row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int val=row;
            while(j<=star){
                System.out.print(val+" ");
                if(j<=star/2) val++;
                else val--;
                j++;
            }
            space--;
            star+=2;
            System.out.println();
            row++;
        }
    }
}

package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=1;
        while(row<=n){
            int i=1,j=1,val=n-row+1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            while(j<=star){
                if(val==10) val=0;
                System.out.print(val+" ");
                if(val==0) val=10;
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

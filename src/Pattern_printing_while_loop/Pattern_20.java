package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n/2;
        int star=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("@ ");
                i++;
            }
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(row<=n/2){
                space--; star+=2;
            }
            else{
                space++; star-=2;
            }
            System.out.println();
            row++;
        }
    }
}

package Pattern_printing_while_loop;

import java.util.Scanner;

public class Pattern_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int no=1;
        int val=1;
        while(row<=n){
            int i=1,j=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            while(j<=no){
                System.out.print(val+"\t");
                val++;
                j++;
            }
            space--;
            no+=2;
            System.out.println();
            row++;
        }
    }
}

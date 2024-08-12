package Pattern_printing;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        /*

         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%2!=0&&(i+j)>=n-2)
                System.out.print("*");
                else System.out.print("|");
            }
            System.out.println();
        }
    }
}

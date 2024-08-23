package Assignment_6478;

import java.util.Scanner;

public class Pattern_with_zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star1=1;
        int star2=0;
        int row=1;
        int c=1;
        int zeroes=0;
        while(row<=n){
            int i=1,k=1,j=1;
            while(i<=star1){
                System.out.print(c+"\t");
                i++;
            }
            while(j<zeroes){
                System.out.print("0"+"\t");
                j++;
            }
            while(k<=star2){
                System.out.print(c+"\t");
                k++;
            }
            c++;
            zeroes++;
            System.out.println();
            row++;
        }
    }
}

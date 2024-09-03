package Assignment_6498;

import java.util.Scanner;

public class replace_them_all {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i=1,s=0;
//        while(n>0){
//            int c=n%10;
//            if(c==0) c=5;
//            s+=c*i;
//            n/=10;
//            i*=10;
//        }
//        System.out.print(s);
        String n = sc.nextLine();
        String r = n.replace('0', '5');
        System.out.println(r);
    }
}

package Assignment_6498;

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=1,sum=0;
        while (n > 0) {
            int rem=n%10;
            if(rem>9-rem){
                rem=9-rem;
                sum+=rem*c;
            }
            else sum+=rem*c;
            c*=10;
            n/=10;
        }
        System.out.println(sum);
    }
}

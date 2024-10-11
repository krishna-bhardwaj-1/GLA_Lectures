package Assignment_6685;

import java.util.Scanner;

public class Maximun_Circular_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int p=sc.nextInt();
            int[] arr=new int[p];
            for(int i=0;i<p;i++) {
                arr[i] = sc.nextInt();
            }
            int ans=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<p;i++){
                sum+=arr[(i-1+p)%p];
                ans=Math.max(ans,sum);
                if(sum<0){
                    sum=0;
                }
            }
            System.out.println(ans);
            n--;
        }
    }
}

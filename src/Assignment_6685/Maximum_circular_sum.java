package Assignment_6685;

public class Maximum_circular_sum {
    public static void main(String[] args) {

    }
    public static int Maximum_Sum(int[] arr){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}

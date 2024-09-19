package Lecture_9;

public class Selection_sort_ {
    public static void main(String[] args) {
        int[] arr={4,-1,5,3,2,1,7};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int idx=main_forn_ith_index(arr,i);
        }
    }
    public static int main_forn_ith_index(int[] arr,int i){
        int mini=i;
        for(int j=i+1;j< arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
}

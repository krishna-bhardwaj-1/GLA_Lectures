package Lecture_7;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,7,9,8};
        int item=8;
        System.out.println(Search(arr,item));
    }
    public static int Search(int[] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}

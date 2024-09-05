package Lecture_7;

public class Array_swap_2 {
    public static void main(String[] args) {
        int[] arr={3,5,1,7,8};
        int[] other={31,51,11,71,81};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,other);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int[] arr,int[] other){
        int[] temp=arr;
        arr=other;
        other=temp;
    }
}

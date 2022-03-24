package Homework1;

import java.util.Arrays;
public class Question3 {
    public static void main(String[] args) {
        int[] arr= new int[]{10, 11, 12, 13, 14};
        System.out.println("First Array ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Revers The First Array");
        System.out.println(Arrays.toString(Revers(arr)));
    }
    public static int [] Revers(int [] arr){
        int[] Arr=new int[arr.length];
        int x,y=arr.length-1;
        for (x = 0;x<=arr.length-1;x++)
            if (y >= 0)Arr[y--] = arr[x];
        return Arr;
    }
}

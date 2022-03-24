package Lap1;

import java.util.Scanner;

/**
 * Created by Amjad on 1/20/2022.
 */
public class Using_Methods {
    public static void main(String[] args) {
        int []Arr =new int [4];


            Elemet_Array(Arr);
            Print_Elements(Arr);
    }
    public static void Print_Elements(int []in1){
        System.out.println(" The Array of Elements are:");
        for (int i = 0; i < in1.length; i++) {
            System.out.print(in1[i]+"\t");
        }
    }
    public static void   Elemet_Array(int []in2){
        Scanner in=new Scanner (System.in);
        System.out.println("Enter Four Elements");
        for (int i = 0; i <in2.length ; i++) {
            in2[i]=in.nextInt();
        }
    }
}

package Homework1;
import java.util.Arrays;
import java.util.Scanner;

    public class Question2 {
        public static void main(String[] args) {
            int []arr={1,2,3,4};
            System.out.println("----------------------------");
            System.out.println(" the first array :");
            System.out.println(arr.toString(arr));
            System.out.println("----------------------------");
            System.out.println(" Backup of first Array :");
            int[]y=bacckup(arr);
            System.out.println(arr.toString(y));

        }

        public static int [] backup(int arr[]){
            int x[]=new int[arr.length];
            for (int i = 0; i <=arr.length-1 ; i++) {
                x[i]=arr[i];
            }
            return x;
        }

    }


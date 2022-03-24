package Lap6;

import java.util.Arrays;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        LinkedStack<Integer> stack =new LinkedStack<>();
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i]= stack.pop();
        }
        System.out.println("After Reverse ");
        System.out.println(Arrays.toString(a));
    }


}

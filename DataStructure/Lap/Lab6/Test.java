package Lap6;

import java.util.Scanner;
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<String> stack=new ArrayStack<>(5);
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            System.out.println("input name :");
            stack.push(input.next());
            System.out.println(" The Top Is : "+ stack.top()+  "\t the Size : "+ stack.size());
        }


        while (!stack.isEmpty()){

            System.out.print(stack.pop()+"\t");
        }




    }
}

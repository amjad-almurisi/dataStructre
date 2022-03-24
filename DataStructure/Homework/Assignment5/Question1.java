
import java.util.Stack;
public class Question1 {


    public static Stack trans(Stack num1, Stack num2){

        for (int i = 0; i < 5; i++) {
            num1.push(i);
        }

        System.out.println("stack Num1 before popping to Stack Num2 :"+
                num1+" Size= "+num1.size());
        while (!num1.isEmpty()){

            num2.push(num1.pop());
        }
        System.out.println("Stack Num1 has popped to Stack to :"+
                "Size= "+ num1.size());
        return num2;
    }
    public static void main(String[] args) {
        Stack <Integer> S=new Stack<>();
        Stack <Integer> T=new Stack<>();
        System.out.println(trans(S,T));

    }
}

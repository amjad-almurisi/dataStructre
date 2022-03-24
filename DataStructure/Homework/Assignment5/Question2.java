
import java.util.Stack;
public class Question2 {

    public static Stack<Integer> RecursPop(Stack stack) {

            if(stack.isEmpty()) {
                return null;
            }

            stack.pop();
            RecursPop(stack);
            return stack;
            }

        public static void main(String[] args) {
            Stack<Integer> stack =new Stack<Integer>();
            for (int i = 0; i <5 ; i++) {
                stack.push(i);
            }
            System.out.println(" The Stack before popping:"+stack);
            System.out.println("The Stack elements after popped:"+RecursPop(stack));

    }

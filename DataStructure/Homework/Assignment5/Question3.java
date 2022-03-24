
import java.util.Stack;
public class Question3 {

        static int postFixEv(String expr)
        {
            Stack<Integer> stack=new Stack<>();

            for(int i=0;i<expr.length();i++)
            {
                char s=expr.charAt(i);
                if(Character.isDigit(s))
                stack.push(s - '0');//?

                else
                {
                    int v1 = stack.pop();
                    int v2 = stack.pop();

                        switch(s)
                        {
                            case '+':
                                stack.push(v2+v1);
                                break;

                            case '-':
                                stack.push(v2- v1);
                                break;



                            case '/':
                                stack.push(v2/v1);
                                break;



                            case '*':
                                stack.push(v2*v1);
                                break;


                        }
                    }
            }
            return stack.pop();
        }


        public static void main(String[] args)
        {

            String exp="426*+2-";
            System.out.println("Expression in normal Case = ((2*6)+4)-2");
            System.out.println("Postfix expression to evaluate = "+exp);
            System.out.println("postfix evaluation: "+postFix(exp));
        }
    }



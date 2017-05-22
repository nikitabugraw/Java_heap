package chapter11;


import java.util.ArrayList;
import java.util.Arrays;

public class StackInAction{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".split("")));
        for (int i=0;i<strings.size();i++){
            if (strings.get(i).equals("+")){
                stack.push(String.valueOf(++i));
                System.out.println(stack);
            } else if (strings.get(i).equals("-")){
                System.out.println(stack.peek());
            }
        }



    }
}

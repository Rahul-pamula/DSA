import java.util.*;

public class Stack_pract {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        stack.push(9);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(9));
        System.out.println(stack.indexOf(9));

        System.out.println(stack.pop());

        System.out.println(stack);
        
    }
}
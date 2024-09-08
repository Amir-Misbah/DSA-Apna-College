import java.util.*;
public class PushBottom{
        public static void print(Stack<Integer> stack) {
        // Create a copy of the stack to avoid modifying the original stack
        Stack<Integer> tempStack = (Stack<Integer>) stack.clone();

        while (!tempStack.isEmpty()) {
            System.out.println(tempStack.pop());
        }
    }
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,4);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        print(s);
        pushAtBottom(s,4);
        System.out.println("After element is pushed at the botttom");
        print(s);
    }
}
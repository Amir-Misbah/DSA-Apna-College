import java.util.*;

public class StackByLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        private Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public Stack copy() {
            Stack newStack = new Stack();
            Node current = head;
            Stack tempStack = new Stack();

            // Push all elements to a temporary stack to reverse the order
            while (current != null) {
                tempStack.push(current.data);
                current = current.next;
            }

            // Push them back to the new stack to maintain the original order
            current = tempStack.head;
            while (current != null) {
                newStack.push(current.data);
                current = current.next;
            }

            return newStack;
        }
    }

    public static void print(Stack s) {
        Stack temp = s.copy();

        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        print(s);
        System.out.println(s.peek());
    }
}

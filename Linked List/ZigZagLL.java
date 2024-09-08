import java.util.*;
public class ZigZagLL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
        public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
       public Node mid(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
       }
    public void print(){
        if(head == null ){
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void zigZag(){
        Node mid = mid();
        Node curr = mid.next;
        mid.next = null;
        Node previous = null;
        Node next = mid ;
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;    
        }
        Node left = head;
        Node right = previous;
        Node nextL,nextR;
        while(left != null && right != null){
            nextL = left.next;
            nextR = right.next;
            left.next = right;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
    public static void main (String args[]){
        ZigZagLL ll = new ZigZagLL();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       ll.print();
       ll.zigZag();
       ll.print();

    }
}
import java.util.*;
public class addElement{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.Node = null;
        }
    }
    public static Node head;
    Public static Node tail;
    public static void main (String args[]){
        LinkedList ll = new LinkedList<>();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        System.out.println(head);
    }
}
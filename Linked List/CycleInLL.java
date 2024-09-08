import java.util.*;
public class CycleInLL{
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
    public static void print(Node head){
        if(head == null ){
            System.out.println("Linked List is empty");
        }
        if(cycle(head)){
            System.out.println("linkedlist has a loop in it");
        }else{
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");}
        return;
    }
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head ;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
             if(slow == fast ){
                cycle = true;
                break;
              }
         }     
        if(cycle == false){
            return;
        } 
        else{
            slow = head;
            Node prev = null;
            while(slow != fast){    
                prev = fast;  
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
        }
        return ;
    }
    public static boolean cycle(Node head){
        Node slow = head;
        Node fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(cycle(head));
        print(head);
        removeLoop(head);
        print(head);

    }
}
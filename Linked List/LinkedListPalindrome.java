import java.util.*;
public class LinkedListPalindrome{
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
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
       }
       public boolean palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = mid();
        
        Node previous = null;
        Node curr = tail = mid;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;    
        }
        Node right = previous;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
       }
        public static void main (String args[]){
        LinkedListPalindrome ll = new LinkedListPalindrome();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(3);
       ll.addLast(2);
       ll.addLast();
       System.out.println(ll.palindrome());
    }
}
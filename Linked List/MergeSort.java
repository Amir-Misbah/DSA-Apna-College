import java.util.*;
public class MergeSort{
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
            return;
        }
        newNode.next =  head;
        head = newNode;

        return;
        
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
    public Node ms( Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = ms(head);
        Node newRight = ms(rightHead);
        return merge(newLeft,newRight);
    }
    public Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
       }
    public static void main(String args[]){
        MergeSort ll = new MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.print();
        ll.head = ll.ms(head);
        ll.print();
    }
}
import java.util.*;
public class Dll{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + " <->  ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head.next == null){
            head = null;
            size = 0;
            return ;
        }
        else if(head == null ){
            System.out.println("LInked list is empty");
            return;
        }
        else{
            head = head.next;
            head.prev = null;
            size--;
            return ;
        }
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        Dll ll = new Dll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        System.out.println(size);
        ll.reverse();
        ll.print();
        System.out.println(size);
    }
}
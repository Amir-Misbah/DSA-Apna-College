import java.util.*;
public class LinkedList{
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
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addMiddle(int index,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 0 ; i < index-1 ; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int sizeOfLL(){
        Node temp = head;
        int size = 0;
        while(temp != null ){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public  int removeFirst(){
       int val = head.data;
       head = head.next;
       return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(head == tail){
            head = tail = null;
        }
        Node temp = head;
        Node previous = head;
        while(temp.next != null){
        previous = temp;
        temp = temp.next;
        }
        int val = temp.data;
        previous.next = null;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public int rsearch(int key){
        return helper(head,key);
    }
    public int helper(Node head,int key){
        if(head == null ){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public void reverse(){
        Node previous = null;
        Node curr = tail = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;    
        }
       head = previous;

    }
    public void nthNodeRemoval(int index){
     Node temp = head;
     int size = 0;
     while(temp != null){
        temp = temp.next ;
        size ++;
     }
     if(index == size){
        head = head.next;
        return;
     }
     
     int iToFind = size - index;
     int i = 1;
     Node pre = head;
     while( i < iToFind){
        pre = pre.next;
        i++;
     }
     pre.next = pre.next.next;
     return;
    }
    public static void main (String args[]){
        LinkedList ll = new LinkedList();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       ll.addLast(6);
       //ll.addMiddle(2,10);
       ll.print();
    //    System.out.println(ll.removeLast());
    //    System.out.println(ll.rsearch(2));
        // ll.reverse();
        ll.nthNodeRemoval(3);
        ll.print();

    }
}
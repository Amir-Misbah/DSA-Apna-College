import java.util.*;
public class QueueLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
    public boolean isEmpty(){
        if(head == null &&  tail == null){
            return true;
        }
        return false;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int remove(){
        if(head == null && tail == null){
            System.out.println("queue is empty");
            return -1;
        }
        int data = head.data;
        if(head == tail){
            head = tail = null;
        }
        else{
        head = head.next;
        }
        return data;
    }
    public int peek(){
         if(head == null && tail == null){
            System.out.println("queue is empty");
            return -1;
        }
        int data = head.data;
        return data;
    }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
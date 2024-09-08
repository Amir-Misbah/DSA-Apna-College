import java.util.*;

public class Basic{
    static class Queue{
         static int size;
        static int arr[];
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            size = n;
        }
        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
        }
        public static void add(int data){
            if(rear == (size-1)){
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1 ;
            arr[rear] = data;
        }
        public static int remove(){
            if(rear == -1){
                System.out.println("queue is empty");
                return -1;
            }
            int data = arr[0];
            for(int i = 0 ; i < rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--;


            return data; 

        }
        public static int peek(){
            if(rear == -1){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q =new  Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
}
}
import java.util.*;
public class PrintInRange{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void print(Node root , int k1,int k2){
        if(root == null ){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            print(root.left,k1,k2);
            System.out.print(root.data + " ");
            print(root.right,k1,k2);
        }
        else if(root.data < k1){
            print(root.right,k1,k2);
        }
        else{
            print(root.left,k1,k2);
        }
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        
        print(root,5,12);
        
    }
}
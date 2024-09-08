import java.util.*;
public class ValidateBST{
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
    public static boolean isValid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        else if(min != null && root.data <= min.data){
            return false;
        }
        else if (max != null && root.data >= max.data){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }
    public static void main(String args[]){
        Node root2 = new Node(3);
        root2.left = new Node(2);
        root2.right = new Node(5);
        root2.left.left =  new Node(1);
        root2.left.right =  new Node(4);
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left =  new Node(1);
        root.left.right =  new Node(4);
        System.out.println(isValid(root2,null,null));
    }
}
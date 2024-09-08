import java.util.*;
public class Mirror{
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
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static Node mirrorBst(Node root){
        if(root == null){
            return null;
        }
        Node ls = mirrorBst(root.left);
        Node rs = mirrorBst(root.right);
        root.left = rs;
        root.right = ls;

        return root;
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        inorder(root);
        System.out.println("");
        Node root2 = mirrorBst(root);
        inorder(root2);

    }
}
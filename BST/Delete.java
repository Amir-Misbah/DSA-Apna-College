import java.util.*;
public class Delete{
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
    public static Node del(Node root,int val){
        if(root.data > val){
            return del(root.left,val);
        }
        else if(root.data < val ){
            return del(root.right,val);
        }
        else{
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            //case 3
          Node Is = findInorder(root.right);
          root.data = Is.data;
          root.right = del(root.right,Is.data);
        }
        return root;
    }
        public static Node findInorder(Node root){
            while(root.left != null){
                root = root.left;
            }
        return root;
        }
        public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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
        inorder(root);
        System.out.println(del(root,5).data);
        inorder(root);
    }
}
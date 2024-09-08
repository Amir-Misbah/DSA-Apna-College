import java.util.*;
public class RootToLeaf{
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
    public static void printPath(Node root,ArrayList<Integer> path){
        if(root == null ){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        printPath(root.left,path);
        printPath(root.right,path);
        path.remove(path.size() - 1);
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
        ArrayList<Integer> path = new ArrayList<>();
        printPath(root,path);
    }
}
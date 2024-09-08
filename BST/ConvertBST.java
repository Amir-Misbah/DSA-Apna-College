import java.util.*;
public class ConvertBST{
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
    public static ArrayList<Integer> inorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
        return list;

    }
    public static Node balanceBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = inorder(root,list);
        Node root2 = createBST(list,0,list.size()-1);
        return root;
    }
    public static Node createBST(ArrayList<Integer> list,int st,int en){
        if(st > en){
            return null;
        }
        int mid = st +(en - st) / 2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list,st,mid-1);
        root.right = createBST(list,mid+1,en);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        preOrder(root);
        Node root2 = balanceBST(root);
        preOrder(root2);
    }
}
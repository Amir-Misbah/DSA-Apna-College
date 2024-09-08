import java.util.*;
public class SortedArrayToBST{
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
    public static Node createBST(int arr[],int st,int en){
        if(st > en){
            return null;
        }
        int mid = st +(en - st) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,en);
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void main(String args[]){
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBST(arr,0,arr.length-1);
        inorder(root);

    }
}
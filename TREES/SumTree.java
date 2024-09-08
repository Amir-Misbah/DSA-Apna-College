import java.util.*;
public class SumTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data ;
            this.left = null;
            this.right = null;
        }
    }
public static int sum(Node root) {
    if (root == null) {
        return 0;
    }
    int originalValue = root.data; // Store the original value
    int leftSum = sum(root.left);
    int rightSum = sum(root.right);

    int leftValue = (root.left != null) ? root.left.data : 0;
    int rightValue = (root.right != null) ? root.right.data : 0;

    root.data = leftSum + rightSum + leftValue + rightValue;

    return originalValue;
}

       public static void levelOrder(Node root){
        if(root == null ){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null ){
                System.out.println(" ");
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data +  " ");
                if(curr.left != null ){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String args[]){
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6); 
         root.right.right = new Node(7);

         int n1 = 5;
         levelOrder(root);
         sum(root);
         levelOrder(root);
    }
}
import java.util.*;
public class MergeBST{
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
    public static void inorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        System.out.println(list1);
        System.out.println(list2);
        int i = 0;
        int j = 0;
        while( i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }
            else{
                finalList.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()){
                 finalList.add(list1.get(i));
                i++;
            }
        while(j < list2.size()){
                finalList.add(list2.get(j));
                j++;
            }
        Node rootMerged = createBST(finalList,0,finalList.size()-1);
        System.out.println(finalList);
        return rootMerged;
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
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node rootFinal = mergeBST(root,root2);
        levelOrder(root);
        levelOrder(root2);
        levelOrder(rootFinal);
    }
}
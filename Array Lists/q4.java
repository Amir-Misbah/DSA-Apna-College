import java.util.*;
public class q4{
    public static ArrayList<Integer> ba(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 2 ; i <= n ; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int e : ans){
                if(2*e <= n){
                    temp.add(2*e);
                }
            }
            for(int e : ans ){
                if ((2*e) - 1 <= n){
                    temp.add((2*e)-1);
                }
            }
            ans = temp;
        }
        return ans;
    }
public static void main(String args[]){
    int n = 2;
    ArrayList<Integer>list = ba(n);
    System.out.println(list);
}
}
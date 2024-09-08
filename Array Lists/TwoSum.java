import java.util.*;
public class TwoSum{
    public static boolean TwoSum(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size() - 1;
        while(lp < rp ){
            
            if( list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target ){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(TwoSum(list,11));
    }
}
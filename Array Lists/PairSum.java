import java.util.*;
public class PairSum{
    public static boolean TwoSum(ArrayList<Integer> list,int target){
        int bp = getBP(list);
        int lp = bp + 1;
        int rp = bp;
        int n = list.size();
        while(lp != rp ){
            
            if( list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target ){
                lp = (lp + 1 ) % n ;
            }
            else{
                rp = ( n + rp - 1 ) % n ;
            }
        }
        return false;
    }
    public static int getBP(ArrayList<Integer>list){
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) > list.get(i+1)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(11,15,6,8,9,10));

        System.out.println(TwoSum(list,25));
    }
}
import java.util.*;

public class q1{
    public static boolean monotone(ArrayList<Integer>list){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i < list.size() -1 ; i++){
            if(list.get(i) < list.get(i+1)){
                inc = false;
            }
            if(list.get(i) > list.get(i+1)){
                dec = false;
            }
        }
    return inc || dec ;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6));
        System.out.println(monotone(list));

    }
}
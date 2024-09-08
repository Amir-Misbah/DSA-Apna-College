import java.util.*;
public class distinctOp{

    public static boolean distinctElements(int arr[]){        //O(n)   O(n)
        HashSet<Integer> set = new HashSet<>();

    for(int i = 0 ; i< arr.length; i++){
        if (set.contains(arr[i])){
            return true;
        }
        else{
            set.add(arr[i]);
        }
    }
    return false;
    }
    public static void main (String args[]){
        int arr[] = new int[]{1,2,3,4 };
        System.out.println(distinctElements(arr));
    }
}
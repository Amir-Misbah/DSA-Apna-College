import java.util.*;
public class distinct{
    // public static boolean distinctElements(int arr[])  O(n2)
    // {
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = i+1 ; j < arr.length;j++){
    //             if(arr[i] == arr[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean distinctElements(int arr[]){//O(n)   O(n)
    Hashset<Integer> set = new Hashset<>();

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
        int arr[] = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(distinctElements(arr));
    }
}
import java.util.*;
public class Bsearch{
     public static int BiSearch(int arr[] , int key){
        
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = end + (start-end)/2;
            if(arr[mid] < key ){
                start = mid+1;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
     return -1;
     }
    public static void main(String args[]){
            int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
    int key = 4;
    System.out.println(BiSearch(arr,key));
    }
}
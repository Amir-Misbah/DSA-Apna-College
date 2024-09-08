import java.util.*;
public class reverse{
      public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
      }
      public static void print(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(" " + arr[i]+ ",");
        }
        System.out.println(" ");
      }



    public static void main (String args[]){
    int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
   print(arr);
   reverse(arr);
   print(arr);

}
}
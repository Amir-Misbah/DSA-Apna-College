import java.util.*;
public class linearSearch{
      public static boolean linearSearch(int arr[],int key){
            for (int i = 0 ; i < arr.length ; i++){
                 if(arr[i] == key){
                   return true;
            }
            }
        return false;
      }



    public static void main (String args[]){
    int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
    int key = 4;
    System.out.println(linearSearch(arr,key));

}
}
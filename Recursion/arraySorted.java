public class arraySorted{
    public static boolean sorted(int arr[],int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
             return false;
        }
       return  sorted(arr,i+1);
       
    }
    public static void main (String args[]){
        int arr[] = new int []{1,2,3,4,5,6,7,8,9};
        System.out.println(sorted(arr,0));
    }
}
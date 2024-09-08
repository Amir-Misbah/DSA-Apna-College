public class lastOcc{
    public static int check(int arr[],int key,int idx){
        if(idx == arr.length){
            return -1;
        }
         int index = check(arr,key,idx+1);
         if(index != -1){
            return index;
         }
        if (arr[idx] == key){
            return idx;
        }
        return index;
    }
    public static void main(String args[]){
        int arr[] = new int[]{8,3,6,9,5,10,2,5,3};
        System.out.println(check(arr,3,0));
        System.out.println(arr.length);
    }
}
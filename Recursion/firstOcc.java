public class firstOcc{
    public static int check(int arr[],int key,int idx){
        if(idx == arr.length-1){
            return -1;
        }
        if (arr[idx] == key){
            return idx;
        }
        return check(arr,key,idx+1);
    }
    public static void main(String args[]){
        int arr[] = new int[]{8,3,6,9,5,10,2,5,3};
        System.out.println(check(arr,3,0));
    }
}
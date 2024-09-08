public class q1{
    public static void occ(int arr[],int n,int key){
        if(n == arr.length ){
            return ;
        }
        if(arr[n] == key){
            System.out.println(n  +  "   ");
        }
        occ(arr,n+1,key);
    }
    public static void main(String args[]){
        int arr[] = new int[]{3,2,4,5,6,2,7,2,2};
        occ(arr,0,2);
    }
}
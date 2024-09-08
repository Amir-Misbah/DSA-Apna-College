public class mergeSort{
    public static void ms(int arr[], int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = si +(ei-si)/2;
        ms(arr, si,mid);
        ms(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si , int mid, int ei){
        int temp[] = new int[ei-si+1];
        
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= ei){
            if( arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while( i <= mid ){
            temp[k] = arr[i];
            i++;
            k++;
        }
        
        while( j <= ei ){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i = si,k = 0 ; i <= ei; i++,k++){
            arr[i] = temp[k];
        }
    }


    public static void main(String args[]){
        int arr[] = new int[]{6,9,5,2,8};
        ms(arr,0,arr.length-1);
    
    for(int i = 0; i < arr.length ; i++){
        System.out.print(arr[i] + ",");
    }
    }
}
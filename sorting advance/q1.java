public class q1{
    public static void sort(String arr[],int si,int ei){
        if(si>= ei){
            return;
        }
        int mid = si + (ei -si)/2;
        sort(arr,si,mid);
        sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[] = new String[ei-si+1];
        
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) < 0){
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
    public static void main (String args[]){
        String arr[] ={"sun","earth","mars","mercury"};
        int si = 0;
        int ei = arr.length-1;
          for(int i = 0 ; i < arr.length; i++){
        System.out.print(arr[i]   +  ", ");
       
    }
     System.out.println(" ");
        sort(arr,si,ei);
    
    for(int i = 0 ; i < arr.length; i++){
        System.out.print(arr[i]   +  ", ");
    }
    }
}
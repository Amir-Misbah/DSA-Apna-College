public class maxSubArraySum{
    public static void main(String args[]){
        int arr[] = new int[]{1,-2,6,-1,3};
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int start;
        int end;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i= 1 ; i < arr.length ; i++){
          prefix[i] =  arr[i] + prefix[i-1];
        }
        for(int i = 0 ; i < arr.length ; i++){
          start = i;
            for ( int j = i ; j < arr.length ; j++){
                end = j;
                currSum = start == 0 ?  prefix[end] : prefix[end] - prefix[start-1] ; 
                if( currSum > maxSum){
                    maxSum = currSum;
                }
                }
                
    
          }
          System.out.println(maxSum);
     }
     
}
public class maxSubArraySum2{
    public static void main(String args[]){
        int arr2[] = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int arr[] = new int[]{-1};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0 ; i < )
            for ( int i = 0 ; i < arr.length ; i++){
              currSum =  currSum + arr[i];
              if(currSum < 0){
                currSum = 0;
              }
              maxSum = Math.max(currSum, maxSum);
          }
          System.out.println(maxSum);
          System.out.println(arr[0]);
     }
     
}
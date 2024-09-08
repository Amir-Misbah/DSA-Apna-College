public class subarray{
    public static void main(String args[]){
        int arr[] = new int[]{-2,-4,6,8,10};
        int count=0;
        int sum =0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
  
        for(int i = 0 ; i < arr.length ; i++){
            for ( int j = i ; j < arr.length ; j++){
                System.out.print("{");
                sum=0;
                for(int k = i ; k <= j ; k++){   
                    System.out.print(arr[k] + ",");
                    sum += arr[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum < minSum){
                    minSum = sum;
                }
                count++;
                 System.out.print("}        ");
            }
            System.out.println(" ");
        }
        System.out.println(count);
        System.out.println(maxSum);
        System.out.println(minSum);
    }
}
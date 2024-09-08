public class CountWays{
    public static int  countWaysRec(int n){
        if(n == 0 ){
            return 1;
        }
        if(n < 0 ){
            return 0;
        }
        int totalWays = countWaysRec(n - 1) + countWaysRec (n-2);
        return totalWays;
    }
    public static void countWaysTab(int dp[] , int n){
        dp[0] = 1 ;
        dp[1] = 1 ;
        for(int i = 2 ; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
    public static void main(String args[]){
        int n = 30;
        int dp[] = new int[n+1];
        countWaysTab(dp,n);

         for(int num : dp){
            System.out.print(num + " ") ;
        }
    }
}
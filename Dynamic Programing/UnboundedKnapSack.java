public class UnboundedKnapSack{
        public static int knapSackUnbounded(int val[],int wt[],int w,int n){
        int dp[][] = new int[n+1][w+1];
        for(int i = 0 ; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j < dp[0].length; j++){
            dp[0][j] = 0;
        }
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 0 ; j < w+1 ; j++){
                int v = val[i -1];
                int wgt = wt[i -1];
                if(wgt <= j){
                    int incProfit = v + dp[i][j-wgt];
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit,excProfit);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
      }
    public static void main(String args[]){
     int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        System.out.println(knapSackUnbounded(val,wt,w,val.length));
    }
}
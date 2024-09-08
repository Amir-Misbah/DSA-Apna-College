import java.util.*;
public class KnapSack01{
    public static int knapSack(int val[],int wt[],int w,int n){
        if(w == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <= w ){
            int ans1 = val[n-1] + knapSack(val,wt,w-wt[n-1],n-1);
            int ans2 = knapSack(val,wt,w,n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return knapSack(val,wt,w,n-1);
        }

    }
    public static int knapSackMem(int val[],int wt[],int w,int n,int dp[][]){
        if(w == 0 || n == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1] <= w ){
            int ans1 = val[n-1] + knapSackMem(val,wt,w-wt[n-1],n-1,dp);
            int ans2 = knapSackMem(val,wt,w,n-1,dp);
            dp[n][w]  = Math.max(ans1,ans2);
            return dp[n][w];

        }
        else{
            dp[n][w]  = knapSackMem(val,wt,w,n-1,dp);
            return dp[n][w];
        }

    }
    public static int knapSackTab(int val[],int wt[],int w,int n){
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
                    int incProfit = v + dp[i-1][j-wgt];
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
        System.out.println(knapSack(val,wt,w,val.length));
        int dp[][] = new int[val.length+1][w+1];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
 
        System.out.println(knapSackMem(val,wt,w,val.length,dp));


        System.out.println(knapSackTab(val,wt,w,val.length));
    }
}
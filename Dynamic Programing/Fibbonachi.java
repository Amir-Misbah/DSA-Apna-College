import java.util.*;
public class Fibbonachi{
    public static int fib(int dp[],int n ){
        if( n == 0 || n == 1 ){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }else{
            dp[n] = fib(dp,n-1) + fib( dp,n - 2);
            return dp[n];
        }
    }
    public static void main(String args[]){
        // int n = 10 ;
        // int dp[] = new int[n+1];
        // System.out.println(fib(dp,n));


        //dp tabulation:
        int n = 10 ;
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1 ;
        for(int i = 2 ; i <=  n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        for(int num : dp){
            System.out.print(num + " ") ;
        }
    }
}
import java.util.*;
public class IndianCoin{
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int val= 5910;
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins = 0 ;
        int amount = val;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < coins.length ; i++){
            if(coins[i] <= amount ){
                while(coins[i] <= amount ){
                    countOfCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }
    System.out.println(countOfCoins +" ");
    System.out.println(ans);
    }
}
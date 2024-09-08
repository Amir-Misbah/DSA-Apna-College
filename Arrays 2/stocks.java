public class stocks{
    public static void main (String args[]){
        int price[]= new int []{7,1,5,3,6,4};
        int buyPrice = price[0];
        int profit;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=1 ; i< price.length;i++){
         if(price[i] < buyPrice){
            buyPrice = price[i];
         }
         else{
            profit = price[i] - buyPrice;
            maxProfit = Math.max(maxProfit,profit);
         }
         
         }
         System.out.println(maxProfit);
    }
}
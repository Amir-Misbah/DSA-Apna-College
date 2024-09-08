import java.util.*;
public class ContainerWithMostWater{
    public static int cwmw(ArrayList<Integer> heights){
        int lp = 0;
        int rp = heights.size() - 1;
        int maxWater = 0;
        while(lp < rp){
            int height = Math.min(heights.get(lp),heights.get(rp));
            int currWater = (rp - lp) * height;
            maxWater = Math.max(maxWater,currWater);
        
           if(heights.get(lp) < heights.get(rp)){
            lp++;
           }else {
            rp--;
           }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        System.out.println(cwmw(heights)); 
    }
}
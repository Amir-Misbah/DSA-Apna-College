import java.util.*;
public class ChocolaProblem{
    public static void main(String args[]){
        int n = 4;
        int m = 6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};
        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());
        int cost = 0;
        int h = 0 ;
        int v = 0;
        int hp = 1;
        int vp = 1;
        while(h < costHor.length && v < costVer.length){
            if(costHor[h] < costVer[v]){
                cost += (costVer[v] * hp);
                vp++; 
                v++;
            }
            else{
                cost += (costHor[h]* vp);
                hp++;
                h++;
            }
        }
        while(h < costHor.length){
            cost += (costHor[h]* vp);
            hp++;
            h++;
        }
        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++; 
            v++;
        }

    System.out.println(cost);
    }
}
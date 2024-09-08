import java.util.*;
public class WeakestSolider{
    static class Row implements Comparable<Row>{
        int soliders;
        int index;
        public Row(int s,int i){
            this.soliders = s;
            this.index = i ;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soliders == r2.soliders){
                return this.index - r2.index;
            }
            return this.soliders - r2.soliders;
        }
    }
    public static void main(String args[]){
        int army[][] = {
                        {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                        };
    int k = 4;
    PriorityQueue<Row> pq = new PriorityQueue<>();
    for(int i = 0 ; i < army.length ; i++){
        int count = 0;
        for(int j = 0; j < army[0].length ; j++ ){
            if(army[i][j] == 1){
                count++;
            }
        }
        pq.add(new Row(count,i));
    }
    for(int i = 0 ; i < k ; i++){
        System.out.println("C"+pq.remove().index);
        }
    }
}
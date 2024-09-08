import java.util.*;
public class PriorityQueueBasic{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(6);
        pq.add(1);
        pq.add(8);
        pq.add(4);
        pq.add(3);
        while(!pq.isEmpty()){
        System.out.print(pq.remove()+ " ");
        }
    }
}
import java.util.*;
public class CountDistinct{
    public static void main(String args[]){
        int arr[]= {4,3,2,5,6,7,3,4,2,1};
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int num : arr){
            lhs.add(num);
        }
        System.out.println(lhs.size());
    }
}
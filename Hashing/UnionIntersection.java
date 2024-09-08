import java.util.*;
public class UnionIntersection{
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        LinkedHashSet<Integer> union = new LinkedHashSet<>();
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        LinkedHashSet<Integer> temp = new LinkedHashSet<>();
        for(int num : arr1){
            union.add(num);
        }
        for(int num : arr2){
            union.add(num);
        }
        System.out.println("Union is : "+ union);
        for(int num : arr1){
            intersection.add(num);
        }
        for(int num : arr2){
            if(intersection.contains(num)){
                temp.add(num);
            }
        }
        intersection = temp;
        System.out.println("intersection is : "+ intersection);
    }
}
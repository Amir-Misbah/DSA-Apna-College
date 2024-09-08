import java.util.*;
public class MajorityElement{
    public static ArrayList<Integer> majorityElement(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){

                hm.put(num,hm.getOrDefault(num,0)+1);
         }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > (arr.length)/3){
                list.add(entry.getKey());
            }

        }
        return list;
    }
    public static void main(String args[]){
        int nums[] ={1,3,2,5,1,3,1,5,1};
        System.out.println(majorityElement(nums));
    }
}
import java.util.*;
public class MultiDimensionAL{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> Mlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list3.add(9);
        list3.add(10);
        list3.add(11);
        list3.add(12);
        // System.out.println(list1);
        // System.out.println(list2);
        // System.out.println(list3);
        Mlist.add(list1);
        Mlist.add(list2);
        Mlist.add(list3);
        // System.out.println(Mlist);
        // traversing the multidimensionn lists
        for(int i = 0 ; i < Mlist.size() ; i++){
            for(int j = 0 ; j < Mlist.get(i).size() ; j++){
                System.out.print(Mlist.get(i).get(j) +" ");
            }
            System.out.println(" ");
        }
    }
}
import java.util.*;

public class MyArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(2);
        System.out.println(list);
        // int count = 0 ;
    //     for( int element : list){
    //         count++;
    //     }
    //     System.out.println(count);
    // }

    // Reverse of an array list
        // for(int i = list.size()-1 ; i >= 0 ;i--){
        //   System.out.println(list.get(i));  
        // }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

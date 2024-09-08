import java.util.*;
public class LinkedHashMapImp{
    public static void main(String args[]){
        LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("china",200);
        lhm.put("nepal",300);
        lhm.put("canada",400);
        System.out.println(lhm);
    }
}
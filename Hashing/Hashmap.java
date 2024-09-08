import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("india",100);
        hm.put("china",150);
        hm.put("usa",110);
        hm.put("uae",170);
        System.out.println(hm);
        System.out.println(hm.get("india"));
        System.out.println(hm.containsKey(150));
    }
}
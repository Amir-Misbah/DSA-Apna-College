import java.util.*;
public class IterationsHashmap{
    public static void main(String args[]){
        HashMap<String ,Integer> hm = new HashMap<>();

        hm.put("india",100);
        hm.put("china",150);
        hm.put("usa",110);
        hm.put("uae",170);
        hm.put("nepal",270);
        hm.put("Bangladesh",370);

        Set<String> keys = hm.keySet();
        // System.out.println(keys);
        // for(String key : keys){
        //     System.out.println("Key : " + key + ",  Value : " + hm.get(key));

        // }
        System.out.println(hm.getValue("india"));
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            // Print each key-value pair
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
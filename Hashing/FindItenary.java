import java.util.*;
public class FindItenary{

    public static String startPos(HashMap<String ,String> hm){
            HashMap<String ,String> rev_hm = new HashMap<>();

            for(String key:hm.keySet()){
                rev_hm.put(hm.get(key),key);
            }
            for(String key : hm.keySet()){
                if(!rev_hm.containsKey(key)){
                    return key;
                }
            }
            return null;
        }
        public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("chennai","bangluru");
        tickets.put("mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");
        String start = startPos(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print("------>" + tickets.get(start));
            start = tickets.get(start);
        }
    }
}
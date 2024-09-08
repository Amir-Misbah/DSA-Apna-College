import java.util.*;
public class numberToString{
    public static StringBuilder bts(Map<Integer,String> map,int n,StringBuilder str){
        if( n == 0 ){
            return str;
        }
        int last = n % 10;
        str.insert(0,map.get(last));
        bts(map,n/10,str);
        
        
        return str;

    }
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"zero ");
        map.put(1,"one ");
        map.put(2,"two ");
        map.put(3,"three ");
        map.put(4,"four ");
        map.put(5,"five ");
        map.put(6,"six ");
        map.put(7,"seven ");
        map.put(8,"eight ");
        map.put(9,"nine ");
        StringBuilder str = new StringBuilder("");
        System.out.println(bts(map,2019,str));
    }
    
}
import java.util.*;
public class ReverseString{
    public static StringBuilder reverse(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder strr = new StringBuilder("");
        while(!s.isEmpty()){
           strr.append(s.pop());
        }
        return strr;
    }
    public static void main(String args[]){
        String str = new String("hellow there mate");
        System.out.println(str);
        StringBuilder strr = reverse(str);
        System.out.println(strr.toString());
    }
}
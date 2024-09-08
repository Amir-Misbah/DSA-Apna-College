public class Permutation{
    public static void per(String str,String ans){
        if( str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++ ){
            char c = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            per(newStr,ans + c);
        }

    }
    public static void main(String args[]){
        per("abc","");
    }
}
public class removeDuplicate{
    public static void remove(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        if(map[str.charAt(idx) - 'a'] == true){
            remove(str,idx+1,newStr,map);
        }
        else{
            map[str.charAt(idx) - 'a'] = true;
            remove(str,idx+1,newStr.append(str.charAt(idx)),map);
        }
        return;

    }
    public static void main( String args[]){
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");
        remove(str,0,newStr,map);

    }
}
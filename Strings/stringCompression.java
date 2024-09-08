public class stringCompression{
    public static StringBuilder compress(String str){
        char ch = str.charAt(0);
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
                if(i == str.length()-1){
                sb.append(ch);
                sb.append(count); 
                }
            }
            else if(str.charAt(i) != ch && count > 1 ){
                sb.append(ch);
                sb.append(count);
                ch = str.charAt(i);
                count = 1;
            }
            else{
                sb.append(ch);
            }
        }
     return sb;
    }
    public static  void main(String args[]){
        
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
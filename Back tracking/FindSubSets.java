public class FindSubSets{
    public static void subset(String str,String s,int i){
        if( i == str.length()){
            System.out.println(s);
            return;
        }
        subset(str,s + str.charAt(i),i+1);
        subset(str,s,i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        subset(str,"",0);
    }
}
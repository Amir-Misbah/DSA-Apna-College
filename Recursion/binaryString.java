public class binaryString{
    public static void bs(int n , int lastPlace, String str){
        if( n == 0){
            System.out.println(str);
            return;
        }
        if( lastPlace == 0){
            bs(n-1,1,str + "1");
            bs(n-1,0,str + "0");
        }
        else{
            bs(n-1,0,str + "0");
        }
        return;
    }
    public static void main(String args[]){
        String str = "";
        bs(3,0,str);
    }
}
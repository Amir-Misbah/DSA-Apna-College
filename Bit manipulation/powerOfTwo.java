public class powerOfTwo{
    public static boolean check(int number){
        int mask = number -1 ;
        if((number & mask) == 0){
            return true;
        }
        return false;
        }
    
    public static void main(String args[]){
        System.out.println(check(15));
    }
}
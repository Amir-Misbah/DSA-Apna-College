
public class setBit{
    public static void set(int number,int shift){
        int mask = 1;
         mask = mask << shift;
        System.out.println((number | mask));
        }
    
    public static void main(String args[]){
        set(10,2);
    }
}
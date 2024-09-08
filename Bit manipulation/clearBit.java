
public class clearBit{
    public static void clear(int number,int shift){
        int mask = 1;
         mask = mask << shift;
        System.out.println((number & (~(mask))));
        }
    
    public static void main(String args[]){
        clear(10,1);
    }
}
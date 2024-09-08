public class clearRangeOfBits{
    public static void clearIBit(int number,int i,int j){
        int mask1 = (~0);
        int mask2 = 1;
         mask1 = mask1 << (j+1);
         mask2 = ((mask2 << i)-1);
         int mask = (mask1 | mask2);
        System.out.println((number & mask));
        }
    
    public static void main(String args[]){
        clearIBit(10,2,4);
    }
}
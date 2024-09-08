public class clearIBits{
    public static void clearIBit(int number,int shift){
        int mask = (~0);
         mask = mask << shift;
        System.out.println((number & mask));
        }
    
    public static void main(String args[]){
        clearIBit(15,2);
    }
}
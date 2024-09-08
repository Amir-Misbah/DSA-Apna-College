public class countBit{
    public static int ith(int number){
        int count = 0;
        while(number > 0){
        int mask = 1;
        if((number & mask) == 1){
            count++;
        }
        number = number >> 1;
        }
        return count;
        }
    
    public static void main(String args[]){
        System.out.println(ith(10));
    }
}
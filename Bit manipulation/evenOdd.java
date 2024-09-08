public class evenOdd{
    public static void evenOdd(int number){
        int mask = 1;
        if((number & mask) != 0){
            System.out.println("The number is odd");
        }
        else{
           System.out.println("The number is even"); 
        }
    }
    public static void main(String args[]){
        evenOdd(3);
        evenOdd(9);
        evenOdd(4);
    }
}
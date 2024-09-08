
public class getBit{
    public static void ith(int number,int shift){
        int mask = 1;
         mask = mask << shift;
        if((number & mask) == 0){
            System.out.println("The number is  0");
        }
        else{
           System.out.println("The number is 1 "); 
        }
        }
    
    public static void main(String args[]){
        ith(10,3);
    }
}

public class updateBit{
    public static void clear(int number,int shift){
        int mask = 1;
         mask = mask << shift;
        System.out.println((number & (~(mask))));
        }
    public static void set(int number,int shift){
        int mask = 1;
         mask = mask << shift;
        System.out.println((number | mask));
    }
    
    public static void main(String args[]){
        String op = "set" ;
        if(op == "set"){
            set(10,1);
        }
        else{
            clear(10,1);
        }

    }
}
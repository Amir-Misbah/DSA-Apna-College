public class powerOp{
    public static int pow(int base , int exp){
        if( exp == 0){
            return 1;
        }
        int halfPow = pow(base,exp/2);
        if(exp % 2 == 0){
            return halfPow * halfPow;
        }
        return halfPow * halfPow * base;
    }
    public static void main(String args[]){
        int base = 2;
        int exp = 10;
        System.out.println(pow(base,exp));
    }
}
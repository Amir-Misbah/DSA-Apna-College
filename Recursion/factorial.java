public class factorial{
    public static int factorial(int num){
        if(num == 0 || num == 1 ){
            return num;
        }
        return num * factorial(num-1);
        
    }
    public static void main(String args[]){
        int num = 3;
        System.out.println(factorial(num));
    }
}
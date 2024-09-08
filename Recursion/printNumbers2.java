public class printNumbers2{
    public static void print(int num){
        if(num == 0 ){
            return;
        }
        print(num-1);
        System.out.println(num);
        
    }
    public static void main(String args[]){
        int num = 10;
        print(num);
    }
}
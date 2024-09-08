public class printNumbers{
    public static void print(int num){
        if(num == 0 ){
            return;
        }
        System.out.println(num);
        print(num-1);
    }
    public static void main(String args[]){
        int num = 10;
        print(num);
    }
}
public class sum{
    public static int sum(int num){
        if(num == 0 || num == 1 ){
            return num;
        }
        return num + sum(num-1);
        
    }
    public static void main(String args[]){
        int num = 10;
        System.out.println(sum(num));
    }
}
public class friendPair{
    public static int pair(int n){
        if( n == 1 || n == 2  ){
            return n;
        }
        int single = pair(n-1);
        int pair  = (n-1) * pair(n - 2);
        int total = single + pair;
        return total;
    }
    public static void main(String args[]){
        System.out.println(pair(4));
    }
}
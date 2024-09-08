public class tileProblem{
    public static int tile(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        int horizontal = tile(n-1);
        int  vertical = tile(n-2);
        int total = horizontal + vertical;
        return total;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(tile(n));
    }
}
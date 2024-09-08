public class ToweOfHannoi{
    public static void toh(int n ,char src, char aux,char dest){
        if( n == 1 ){
            System.out.println( src + "    ------>    " + dest);
            return;
        }
        toh(n-1,src,dest,aux);
        toh(1,src,aux,dest);
        toh(n-1,aux,src,dest);
        return;
    }
public static void main(String args[]){
    toh(3,'A','B','C');
}
}
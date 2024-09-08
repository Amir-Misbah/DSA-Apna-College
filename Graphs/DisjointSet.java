import java.util.*;
public class DisjointSet{
    static int n = 7 ;
    static int par[] = new int[n];
    static int rank[] = new int[n];
    public static void init(){
        for (int i = 0 ; i < n ; i++){
            par[i] = i ;
        }
    }
    public static int findPar(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = findPar(par[x]);
    }
    public static void union(int a , int b){
        int parA = findPar(a);
        int parB = findPar(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
        else if( rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else{

            par[parB] = parA ;
        }
    }
    public static void main(String args[]){
        init();
        union(1,3);
        System.out.println(findPar(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(findPar(3));
        System.out.println(findPar(4));

    }
}
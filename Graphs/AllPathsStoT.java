
import java.util.*;
public class AllPathsStoT{
        public static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.src = src ;
            this.dest = dest;
        }
    }
    public static void printPath(ArrayList<Edge> graph[] ,int src,int dest,String path){
        if(src == dest){
            System.out.println(path);
        }
        for(int i = 0 ; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printPath(graph,e.dest,dest,path+ src);
        }
    }
    public static void main(String args[]){
        int v = 6 ;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        //2
        graph[2].add(new Edge(2,3));
        //3
        graph[3].add(new Edge(3,1));
        //4
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        //5
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        int src  = 5 ; 
        int dest = 1;
        printPath(graph,src,dest,"");
    }
}
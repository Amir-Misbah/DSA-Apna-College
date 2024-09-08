import java.util.*;
public class CycleDetection{
        public static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.src = src ;
            this.dest = dest;
        }
    }
    public static boolean cycleUtil(ArrayList<Edge> graph[],boolean vis[],boolean stack[],int curr){
        vis[curr] = true;
        stack[curr] = true;
        for(int i = 0 ; i < graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return  true;
            }
            if(!vis[e.dest] && cycleUtil(graph,vis,stack,e.dest)){
                return true;
            }   
        }
        stack[curr] = false;
        return false;
    }
    public static boolean cycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i = 0 ; i < graph.length ; i++){
            if(!vis[i]){
                if(cycleUtil(graph,vis,stack,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
                int v = 5 ;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0,2));    
        // 1
        graph[1].add(new Edge(1,0));
        //2
        graph[2].add(new Edge(2,3));
        //3
        graph[3].add(new Edge(3,0));
        //find two's neighbour

        System.out.println(cycle(graph));
    }
}
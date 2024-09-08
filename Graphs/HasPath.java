import java.util.*;
public class HasPath{
    public static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src , int dest , int weight){
            this.src = src ;
            this.dest = dest;
            this.weight = weight ;
        }
    }
    public static boolean hasPath(ArrayList<Edge> graph[],boolean vis[],int src,int dest){
        if(src == dest){
            return true;
        }

        vis[src] = true;

        for(int i = 0 ; i < graph[src].size() ; i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph,vis,e.dest,dest)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int v = 7 ;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        // 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        //2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        //3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));
        //4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));
        //5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        //6
        graph[6].add(new Edge(6,5,1));

        //find two's neighbour
        boolean vis[] = new boolean[graph.length];
        System.out.println(hasPath(graph,vis,0,5));
    }
}
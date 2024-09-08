import java.util.*;
public class DepthFirstSearch{
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
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i = 0 ; i < graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
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
        dfs(graph,0,vis);
    }
}
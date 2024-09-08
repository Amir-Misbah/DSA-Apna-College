import java.util.*;
public class BellmanFord{
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
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n = n;
            this.path = path;
        }
        @Override
       public int compareTo(Pair p2){
        return this.path - p2.path;
    }
    }
 
    public static void bellman(ArrayList<Edge> graph[],int src){
        int dist[] =new int[graph.length];
        for(int i = 0 ; i < graph.length ; i++){
            if( i != src ){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int l = graph.length;
        for(int i = 0 ; i < l-1 ; i++){
            for(int j = 0 ; j < graph.length; j ++){
                for(int k = 0 ; k < graph[j].size() ; k++){      
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                int w = e.weight;
                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                   }
                }
            }
        }

        for(int i = 0 ; i < dist.length ; i++){
            System.out.print(dist[i] + " ");
    }
    }
    public static void main(String[] args){
        int v = 5 ;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        // 1
        graph[1].add(new Edge(1,2,-4));
        //2
        graph[2].add(new Edge(2,3,2));
        //3
        graph[3].add(new Edge(3,4,4));
        //4
        graph[4].add(new Edge(4,1,-1));
        int src =0 ;
        bellman(graph,src);
    }
}
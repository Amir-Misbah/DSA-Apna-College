import java.util.*;
public class Prims{
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
        int v;
        int c;
        public Pair(int v,int c){
            this.v = v;
            this.c = c;
        }
        @Override
       public int compareTo(Pair p2){
        return this.c- p2.c;
    }
    }
 
    public static void prims(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalCost = 0 ;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.c;
                for(int i = 0 ; i < graph[curr.v].size() ; i++){
                Edge e = graph[curr.v].get(i);
                pq.add(new Pair(e.dest,e.weight));
                }
            } 
        }
        System.out.println(finalCost);
    }
    public static void main(String[] args){
        int v = 5 ;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }
        //0
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        // 1
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        //2
        graph[2].add(new Edge(2,3,50));
        graph[2].add(new Edge(2,0,15));
        //3
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
        graph[3].add(new Edge(3,0,30));
        prims(graph);
    }
}
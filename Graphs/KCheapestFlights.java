import java.util.*;
public class KCheapestFlights{
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src,int dest,int weight){
            this.src = src ;
            this.dest = dest;
            this.weight = weight;
        }
    }
    static class Info{
        int v;
        int cost;
        int stops;
        public Info(int v,int cost,int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static void createGraph(int flights[][],ArrayList<Edge>graph[]){
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i <  flights.length ; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int weight = flights[i][2];
            Edge e = new Edge(src,dest,weight);
            graph[src].add(e);
        }
    }
    public static int cheapestFlight(int n , int flights[][],int src,int dest,int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights,graph);

        int dist[] = new int[n];
        for(int i = 1 ; i < graph.length ; i++){
            if( i != src ){
                dist[i] = Integer.MAX_VALUE;
            }  
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0,0));
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k ){
                break;
            }
            for(int i = 0 ; i < graph[curr.v].size() ; i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int weight = e.weight;
                if(curr.cost + weight < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + weight ;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dest];
        }
    }
    public static void main(String args[]){
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0 ; int dest = 3 ;int k = 1 ;
        System.out.println(cheapestFlight(n,flights,src,dest,k));
    }
}
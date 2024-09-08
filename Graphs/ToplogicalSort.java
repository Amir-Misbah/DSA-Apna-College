import java.util.*;
public class ToplogicalSort{
        public static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.src = src ;
            this.dest = dest;
        }
    }
    public static void topSortUtil(ArrayList<Edge> graph[],boolean vis[],Stack<Integer> stack,int curr){
        vis[curr] = true;
        
        for(int i = 0 ; i < graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest] ){ 
                topSortUtil(graph,vis,stack,e.dest);
             }
        }
        stack.push(curr);
    }
    public static void topSort(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < graph.length ; i++){
            if(!vis[i]){
                topSortUtil(graph,vis,stack,i);    
                }
            }
           while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
           }
        }
    public static void main(String args[]){
                int v = 6 ;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i = 0 ; i < v ; i++){
            graph[i] = new ArrayList<>();
        }

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

        topSort(graph);
    }
}
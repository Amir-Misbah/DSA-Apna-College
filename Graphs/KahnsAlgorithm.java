import java.util.*;
public class KahnsAlgorithm{
        public static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.src = src ;
            this.dest = dest;
        }
    }
    public static void calIndegree(ArrayList<Edge> graph[],int indegree[]){
        for(int i = 0 ; i < graph.length ; i ++){
            for(int j = 0 ; j < graph[i].size() ; j++){
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }
        public static void topSort(ArrayList<Edge> graph[]){
            int indegree[] = new int[graph.length];
            calIndegree(graph,indegree);
            Queue<Integer> q = new LinkedList<>();
            for(int i = 0 ; i < indegree.length ; i++){
                if(indegree[i] == 0 ){
                    q.add(i);
                }
            }
            while(!q.isEmpty()){
                int curr = q.remove();
                System.out.print(curr + " ");
            
            for(int i = 0 ; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;
                if(indegree[e.dest] == 0){
                    q.add(e.dest);
                }
            }
            }
            System.out.println("");
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
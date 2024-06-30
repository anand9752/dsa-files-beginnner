import java.util.ArrayList;

public class has_path_02 {
   static class Edge{
    int src ;
    int dest;

     public Edge(int s , int d){
        this.src = s;
        this.dest = d;
    }
   }

  public static void main(String[] args) { 
    int v = 7;
    ArrayList<Edge>[] graph = new ArrayList[v];
   for (int i = 0; i < graph.length; i++) {
    graph[i] = new ArrayList<>();
   }
    graph[0].add(new Edge(0,1));
    graph[0].add(new Edge(0, 2));
    

    graph[1].add(new Edge(1,3));
    graph[2].add(new Edge(2,4));
    graph[3].add(new Edge(3,5));
    graph[3].add(new Edge(3,4));

    graph[4].add(new Edge(4,5));

    graph[5].add(new Edge(5, 6));

   boolean vis[]  = new boolean[v];
  
   System.out.println(hasPath(graph, 0, 6, vis));





     



  }

  public static boolean hasPath(ArrayList<Edge>[] graph , int src,int dst,boolean vis[]){
    
    if(src == dst) return true;
    vis[src] = true;
    
    for (int i = 0; i < graph[src].size(); i++) {
        Edge edge = graph[src].get(i);
        if (!vis[edge.dest] && hasPath(graph, edge.dest, dst, vis)) {
            return true;
        }
    }


    return false;
  }
    
} 
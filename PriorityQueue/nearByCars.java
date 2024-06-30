import java.util.PriorityQueue;

public class nearByCars {
      
    public static class distance implements Comparable<distance>{
        int x ;
        int y;
        int distSq;
        distance(int x,int y,int distSq){
            this.distSq = distSq;
            this.x= x;
            this.y =y;


        }

        @Override
        public int compareTo(distance d1){
         return this.distSq - d1.distSq;   
        }
    }
    

    public static void main(String[] args) {
        int pts[][] = {{3,3} , {5,-1}, {-2,4}};
       PriorityQueue<distance> pq= new PriorityQueue<>();
       
        for (int i = 0; i < pts.length; i++) {
            int dis = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add( new distance(pts[i][0],pts[i][1], dis));
        }


        while (!pq.isEmpty()) {
            System.out.println(pq.peek().distSq);
            pq.remove();
            
        }
    }
}
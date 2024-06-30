import java.util.Comparator;
import java.util.PriorityQueue;
public class implementation{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(45); //adding a number in time comlexity of O(log n) where n is number that is already exist in pq
         pq.add(2);
        pq.add(34);
        pq.add(5);
        pq.add(1);
       while(!pq.isEmpty()){
         System.out.println(pq.remove());
         
        
       }



    }
}
import java.util.PriorityQueue;

public class connectRopes {
    



    public static void main(String[] args) {

        int arr[] = {4,2,3,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       for (int i : arr) {
        pq.add(i);
       }

        int sum =0 ;
        
        while (pq.size()>1) {
           int min = pq.remove();
           int min2 = pq.remove();
           sum = sum+min+min2;
           pq.add(min+min2);
        }
        System.out.println(sum );
    }
}

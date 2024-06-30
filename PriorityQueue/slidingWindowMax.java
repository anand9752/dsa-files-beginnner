import java.util.PriorityQueue;
import java.util.*;
public class slidingWindowMax {
    static class Pair implements Comparable<Pair>{
        int idx ;
        int data;
        Pair(int idx , int data){
            this.idx = idx;
            this.data = data;

        }
        @Override
        public int compareTo(Pair p) {
           return p.data- this.data   ;
        }
    }
    

    public static void slidingWindow(int res[] ,PriorityQueue<Pair> pq,int arr[],int k ){
      int i = 0;
      int j = 0;
      int s= 0;
        while ( j<arr.length) {
          
            if (j-i+1 != k) {
                pq.add(new Pair(j, arr[j]));
                
            }
            if (j-i+1==k) {
                while (pq.peek().idx <= j-k) {
                    pq.remove();
                    
                }
                pq.add(new Pair(j, arr[j]));
                res[s++] = pq.peek().data;
                i++;
                
            }
            j++;
        }



    }

    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[] = new int[arr.length -k+1];
        System.out.println(2312);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
     slidingWindow(res, pq, arr, k);
for (int ans : res) {
    System.out.println(ans);            
}
System.out.println(123);

    }
}

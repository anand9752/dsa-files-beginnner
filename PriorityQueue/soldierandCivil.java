import java.util.PriorityQueue;

public class soldierandCivil {
    

    public static class Row implements Comparable<Row> {
        int ith;
        int solSum;
      public  Row(int ith,int solSum){
            this.ith = ith;
            this.solSum = solSum;
        }




        @Override
        public int compareTo( Row r) {
           if (this.solSum == r.solSum) {
              return this.ith - r.ith;
           }
           else{
            return r.solSum - this.solSum; 
           }
         
        }
    }

    public static void main(String[] args) {
        int army[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0;i<army.length;i++) {

            int sum =0;
            for (int j = 0; j < army.length; j++) {
                sum+= army[j][i]==1 ? 1 : 0 ;
            }
            pq.add(new Row(i, sum));
            

        }

      for (int i = 0; i < 2; i++) {
        System.out.println(pq.remove().ith);
      }

    }
}

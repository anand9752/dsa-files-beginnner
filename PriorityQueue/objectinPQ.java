import java.util.Comparator;
import java.util.PriorityQueue;

public class objectinPQ {
    

    public static class Student implements Comparable<Student>  {
        String name;
        int rank;
        Student(String name , int  rank){
            this.name = name;
            this.rank = rank;

        }
        @Override
        public int compareTo(Student s2) {
            
            return this.rank - s2.rank;
        }
    }
  public static void main(String[] args) {
    
    PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

    pq.add(new Student("a", 32));
    pq.add(new Student("b", 2));
    pq.add(new Student("c", 8));
    pq.add(new Student("d", 155));
    pq.add(new Student("e", 1));


    while (!pq.isEmpty()) {
        System.out.println(pq.peek().name + "- >" + pq.peek().rank );
        pq.remove();
    }
  }
    
}

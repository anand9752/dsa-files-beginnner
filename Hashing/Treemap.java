import java.util.TreeMap;

public class Treemap {
    
   //keys are in sorted order
    public static void main(String[] args) {
        
        TreeMap<Integer,Integer> tm  = new TreeMap<>();
        tm.put(213, 23);
        tm.put(2, 66);
        tm.put(33, 34);
        System.out.println(tm);
    }
}

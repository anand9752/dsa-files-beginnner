import java.util.*;
public class findMax {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList <>();
        list.add(2);
                list.add(8);
                        list.add(10);
                                list.add(44);
                                        list.add(0);

                                        int max = Integer.MIN_VALUE;
                                        for (int i = 0; i <list.size() ; i++) {
                                            max = Math.max(max, list.get(i));
                                            
                                        }
                                        System.out.println(max);




    }
    
}

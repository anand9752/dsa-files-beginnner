import java.util.HashMap;
import java.util.Set;
import javax.swing.RowFilter.Entry;
 import java.util.Map;
public class hashMap{

   public static void main(String[] args) {
    
    HashMap<String,Integer> hm =new HashMap();
    hm.put("india", 34);
    hm.put("usa", 12);
    hm.put("china", 54656);
    hm.put("hell", 234);

    Set<String> keys = hm.keySet();

    // for (String string : keys) {
    //     System.out.println(string);
    // }
    System.out.println(hm);


   
   }
}
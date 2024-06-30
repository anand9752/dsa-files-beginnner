    
import java.util.*;
public class MoveAllX{
    public static void MoveAllx (String str, int idx, int count , String newstr , char spell){
        if (idx == str.length() ) {
            for (int i = 0; i < count; i ++) {
                newstr += spell;
            
                
            }
            System.out.println(newstr);
            return;
            
        }
        char currentchar = str.charAt(idx);
        if (currentchar == spell) {
            count++;
            MoveAllx(str, idx+1, count, newstr, spell);
            
        } else {
            newstr += currentchar;
            MoveAllx(str, idx +1, count, newstr, spell);
        }
   
        
    }


           
    


    


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    char spell = sc.next().charAt(0);
    MoveAllx(word, 0, 0, "",spell);
    
}
}


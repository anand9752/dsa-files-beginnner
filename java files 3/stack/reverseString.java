package stack;
import java.util.*;

public class reverseString {


    public static String reverse(String str){

        Stack<Character> s = new Stack<>(); // stack banaana hai
        //index ko 0 se initialse krna h
        int idx = 0;
     while (idx < str.length()) {
        s.push(str.charAt(idx)); // ek ek kr ke str me se char nikalkr stack me bharna h aur jb hm use nikale ge to ulta nikalegea
        idx++;
        
     }



     StringBuilder newstr = new StringBuilder("");
     while (!s.isEmpty()) {
        char curr = s.pop();
        
        newstr.append(curr);// mtlb add krna
        
     }
return str = newstr.toString(); // stringbuilder ko string me change krne me help kreta hai

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
System.out.println(reverse(str));




        
    }
    
}

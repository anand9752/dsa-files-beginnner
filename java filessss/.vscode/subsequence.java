import java.util.*;
public class subsequence{
    public static void subsequences(String str , int idx, String newstr){
if (idx ==str.length()) {
    System.out.println(newstr);
    return;
    
}
    char currentChar = str.charAt(idx);

subsequences(str, idx+1,newstr + currentChar);
subsequences(str, idx+1,newstr);


    }



    public static void main(String[] args) {
        String str ="cvsfrr";
        subsequences(str, 0, "");
        
    }
    
}

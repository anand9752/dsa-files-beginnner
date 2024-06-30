import java.util.*;
public class reverse{
    public static void printReverse(int idx, String str){
   if (idx ==0) {
    System.out.println(str.charAt(idx));
    return;
    
   }
    
    System.out.print(str.charAt(idx));
    printReverse( idx - 1, str);

    }



    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String ydd = sc.nextLine();
            printReverse(ydd.length() -1, ydd);
        }
        
    }
}
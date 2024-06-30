import java.util.*;
public class arrays {
    public static void change(int kya[]){
        for (int i = 0; i < kya.length; i++) {
            kya[i] = kya[i] + 1;               
            }
            
        }
    
    



    public static void main(String[] args) {
        int kya[] = {1,2,3};
        change(kya);


        for (int i = 0; i < kya.length; i++) {
            System.out.println(kya[i]);
            
        }

        
    }

}
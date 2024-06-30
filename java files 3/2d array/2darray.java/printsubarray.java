
    
import java.util.*;
public class printsubarray {
    public static void  SubArray(int number[]){
        for (int i = 0; i < number.length; i++) {
        
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                    
                }
                System.out.println();
            }
            
        }

    
return;

    }
    public static void main(String[] args) {


        int number[] = new int[5];

                     
                        for (int  i = 0; i < number.length; i++) {
                            Scanner sc = new Scanner(System.in);
                            number[i] = sc.nextInt();

            
                            
                         }
                         
                         SubArray(number);

                         
                    
                                
                        }  
                    
        
    }
    



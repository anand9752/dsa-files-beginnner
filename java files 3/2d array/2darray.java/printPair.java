import java.util.*;
public class printPair {
    public static void  Pairs(int number[]){
        for (int i = 0; i < number.length; i++) {;
            int curr = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.println("(" + curr + "," + number[j]+")");
                
            }
            System.out.println();
        }

    
return;

    }
    public static void main(String[] args) {


        int number[] = new int[5];

                     
                        for (int  i = 0; i < number.length; i++) {
                            Scanner sc = new Scanner(System.in);
                            number[i] = sc.nextInt();
            
                            
                         }
                         
                         Pairs(number);

                         
                    
                                
                         
                    
        
    }




    
    }

    


import java.util.*;
public class getlargest {
    public static int GetLargest(int number[]){

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
                
                
            }
            
        }
        return largest;
    

        }
    



    public static void main(String[] args) {


        int number[] = new int[5];

                     
                        for (int  i = 0; i < number.length; i++) {
            Scanner sc = new Scanner(System.in);
                            number [i]  = sc.nextInt();
                         }

                         
                        System.out.println( "the greatest num is " + GetLargest(number));
                                
                         
                    
        
    }




    @Override
    public String toString() {
        return "getlargest []";
    }

    
}

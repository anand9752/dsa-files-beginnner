
    
import java.util.*;
public class maxsumSubArray {
    public static void  maxsumSubArrays(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
        
            for (int j = i; j < number.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                    
                    
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                    
                }
            }
            
        }

    System.out.println(maxSum);
return;

    }
    public static void main(String[] args) {


        int number[] = new int[5];

                     
                        for (int  i = 0; i < number.length; i++) {
                            Scanner sc = new Scanner(System.in);
                            number[i] = sc.nextInt();

            
                            
                         }
                         
                         maxsumSubArrays(number);

                         
                    
                                
                        }  
                    
        
    }
    




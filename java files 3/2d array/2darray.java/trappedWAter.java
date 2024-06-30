import java.util.*;
public class trappedWAter {
    public static int findtrapped (int height[]){
      int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

   for (int i = 1; i < n; i++) {
    leftmax[i] = Math.max(height[i], leftmax[i-1]);
    
   }
   int rightmax[] = new int[n];
   rightmax[n-1] = height [n-1];
   for (int i = n-2; i >= 0; i--) {
    rightmax[i] = Math.max(height[i], rightmax[i +1]);

    
   }
   int waterlevel[]=new int[n];
   for (int i = 0; i < rightmax.length; i++) {
    waterlevel[i] =  Math.min(leftmax[i], rightmax[i]);


    
   }
   int trappedWater = 0;
   for (int i = 0; i < waterlevel.length; i++) {
    trappedWater += (waterlevel[i] - height[i]);

    
   } 
   return trappedWater ;
    
   


    }
    



    public static void main(String[] args) {
        int height[] = new int[7];
        for(int i = 0 ; i < 7; i++){
            Scanner sc = new Scanner(System.in);
            height[i] = sc.nextInt();
            
        }
    System.out.println(findtrapped(height));
        
    }
}

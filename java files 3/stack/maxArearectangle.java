package stack;

import java.util.Stack;
import java.util.*;

public class maxArearectangle {
    public static int maxarea(int arr[]){
        int maxarea = 0;

        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        // next smaller right
for(int i = arr.length-1 ; i >= 0 ; i--){
        while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
            
        }

        if(s.isEmpty()){
            nsr[i] = arr.length;


        } else {
            nsr[i] = s.peek();
        }
    s.push(i);

}
//next smaller left
    s = new Stack<>();
for(int i = 0 ; i < arr.length; i++){
        while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
            
        }

        if(s.isEmpty()){
            nsl[i] = -1;


        } else {
            nsl[i] = s.peek();
        }
    s.push(i);

}


for (int i = 0; i < nsl.length; i++) {
    int ht = arr[i];
    int wdt = nsr[i] - nsl[i]-1;
    int area = ht*wdt;
    maxarea = Math.max(maxarea, area);

    
}
 return maxarea;
    }


    public static void main(String[] args) {
        int arr[] = {2,4};
        int ans = maxarea(arr);
 System.out.println(ans);
        
    }
    
}

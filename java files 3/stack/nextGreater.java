package stack;

import java.util.Stack;

public class nextGreater {


    public static void main(String[] args) {

        int arr[] = {6,8,0,1,3};
                Stack<Integer> s = new Stack<>();

        int nextg[] = new int[arr.length];


        for (int i = arr.length -1; i >=0; i--) {

            //1st step while loop

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {

                s.pop();
                
            }



            // if condition
            if (s.isEmpty()) {
                nextg[i] = -1;
                
                
            } else {
                nextg[i] = arr[s.peek()];

            }



            //s pop 
            s.push(i);
            
        }

        for (int j = 0; j < nextg.length; j++) {
            // System.out.print(nextg[j]+ " ");
            
        }

        int n = 121;
        n = n/10;
        System.out.println(n);

    }
    
}

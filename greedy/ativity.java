

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ativity {
    public static void main(String[] args) {
        

        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};


        //sorting
        int activities[][] = new int[start.length][3 ];
        for (int i = 0; i <start.length; i++) {
            activities[i][0]=i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];

             
        }

        // lambda function sort end with start  
         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> arr = new ArrayList<>();
        int lastEnd = 0;
        int count = 0;
        arr.add(0);


        count = 1;
        lastEnd = end[0];


        for(int i = 1 ; i< end.length;i++){
            if(start[i] >= lastEnd){
                count ++;
                lastEnd = end[i];
                arr.add(i);

            }
        }
        System.out.println("max activities" + count);
       
        for(int i = 0 ; i<arr.size(); i++){
            System.out.println("A" + arr.get(i)+ " ");
        }
        


    }

    
}

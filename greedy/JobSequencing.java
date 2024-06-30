import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static void main(String[] args) {
        

        int JobInfo[][] = {{4,20 }, {1,10}, {1,40} , {1,30}};

        Arrays.sort(JobInfo, Comparator.comparingDouble( o -> o[1]));
        ArrayList<Integer> Job = new ArrayList<>();
        int time = 0;
        int maxprofit =0;
        int numofworks = 0;
        for(int i = JobInfo.length -1 ; i <= 0 ; i++){

            if (JobInfo[i][0] > time) {

                time++;   //take unit time to do any work
                Job.add(JobInfo[i][1]);
                maxprofit += JobInfo[i][1];
                numofworks++;

                
            }


              
        
               


        }
    System.out.println(Job);
    System.out.println(numofworks);
    System.out.println(maxprofit);

    }
    
}

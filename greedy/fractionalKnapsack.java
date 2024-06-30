
import java.util.Arrays;
import java.util.Comparator;


//weight kam ho value jyada ho

public class fractionalKnapsack {
    public static void main(String[] args) {

        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        double ratio[][] = new double[value.length][2];
        //oth col => idx 1st col ratio

        for (int i = 0; i < 
        value.length; i++) {

            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];

            
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = 50;
        int total = 0;
        int idx =0;;
        for (int j = ratio.length-1 ; j >=0   ;j-- ) {
               idx = (int)ratio[j][0];
            if(capacity>=weight[idx]){
                total += weight[idx];
                capacity -= weight[idx];


            } else {
                total += (ratio[j][1] * capacity);
                capacity=0;
                break;
            }
            
        }
        System.out.println("total is "+ total);
        
    }

    
    
}

import java.util.Arrays;
import java.util.Comparator;

public class maxLengthOfChainOfpairs{
    public static void main(String[] args) {
        int pairs[][] ={{5,24} , {39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlength =1;
        int last2ndnum = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {

            if(pairs[i][0] > last2ndnum){

                chainlength++;
                last2ndnum = pairs[i][1];
            }
            
        }

        System.out.println(chainlength);

    }


    
}

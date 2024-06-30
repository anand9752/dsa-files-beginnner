
import java.util.Arrays;

public class minAbsoluteDifferencePairs {
    public static void main(String[] args) {
        
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);
        int mindiff =0;
        
        // int diff[] = new int[A.length];

        for(int i =0; i <A.length;i++){

            mindiff += Math.abs(A[i] -B[i]);


        }
        //    int sum =0;
        // for (int i = 0; i < diff.length; i++) {
        //     sum += diff[i];
            
        // }

        System.out.println(mindiff);
    }
    
}
 

import java.util.*;

// invite n guest as single or double

public class invitesingledouble {
    
    public static int CountWay(int n){
        if (n <=0) {
            return 1;
            
        }
        

    int single = CountWay(n-1);
    int doubles =  (n -1) * CountWay(n-2);
    return single + doubles  ;

    }




    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int totalway = CountWay(n);
            System.out.println(totalway);
        }
        
    }
    
}

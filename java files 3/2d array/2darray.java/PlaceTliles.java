import java.util.*;


// place the tiles of size 1xm in nxm...?

public class PlaceTliles {
    public static int CountWay(int n, int m){
        if (n == m) {
            return 2;

            
        }
        if (n<m) {
            return 1;
            
        }

    int verticalpath = CountWay(n-m, m);
    int horizontal = CountWay(n-1, m);
    return verticalpath +horizontal;

    }




    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int totalway = CountWay(n, m);
            System.out.println(totalway);
        }
        
    }
    
}

import java.util.*;
public class power{
    public static int givenpower(int x, int n){
        if (n == 0 ) {
            return 1;
        } if (x == 0) {
            return 0;
        }
        givenpower(x, n -1);
        int last = x*givenpower(x, n - 1);
        return last;
        




    }



    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            givenpower(x, n);
            int ans = givenpower(x, n);
            System.out.println(ans);
        }
        
    }
}








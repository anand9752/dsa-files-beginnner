import java.util.Scanner;
public class recursionfact2 {

 public static int factorial(int n){
    if(n == 1 || n ==0){
        return 1;
    }
    int fact_of = factorial(n-1);
    int fact = fact_of*n;
    return fact;
 }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);

      

     
    }
    
}

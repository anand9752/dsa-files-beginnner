import java.util.Scanner;
public class recursionfact {

 public static void printnum(int n, int i ,int factorial   ){
    if (i ==n ) {
        factorial *= i;
       System.out.println(factorial);
        return;
        
    }
    factorial *= i;
    printnum(n, i+1, factorial);
 }
 
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();


            printnum(n, 1, 1);
        }

      

     
    }
    
}

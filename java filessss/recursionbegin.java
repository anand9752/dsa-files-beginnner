import java.util.Scanner;
public class recursionbegin {

 public static void printnum(int n, int i ,int sum   ){
    if (i ==n ) {
        sum += i;
       System.out.println(sum);
        return;
        
    }
    sum += i;
    printnum(n, i+1, sum);
 }
 
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();


            printnum(n, 1, 0);
        }

      

     
    }
    
}

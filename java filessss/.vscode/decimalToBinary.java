import java.util.Scanner;

import java.util.*;
public class decimalToBinary {


    public static int binary(int n){
    if (n == 0) {
        return 0;

        
    } else{
        return (n %2 + 10 *binary(n /2));
    }


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
        
    }
    
    
}

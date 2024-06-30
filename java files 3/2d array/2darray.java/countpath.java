
    

import java.util.*;
public class countpath{
    public static int countPath(int i , int j, int n, int m){
        if (i== n-1 && j ==m-1) {
            return 1;
            
        }
        if (i ==n || j== n) {
            return 0;
            
        }
        int rightpath = countPath(i, j+1, n, m);
        
        int downpath = countPath(i+1, j, n, m);

        
        return rightpath + downpath;


    }
    public static void main(String[] args) {
 
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
                    int m= sc.nextInt();
                    int totalpath = countPath(0, 0, n, m);
                    System.out.println(totalpath);
        }

        
    }
}
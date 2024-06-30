import java.util.*;
public class sorting{
    public static boolean CheckSorting(int idx, int arr[]){
    if (idx == arr.length-1) {
        return true;
        
    }


        if (arr[idx] < arr [idx + 1]) {
            return CheckSorting(idx + 1 , arr);
            
        } else{
            return false;
        }
    }


    


    


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
        int b= sc.nextInt();
            int c = sc.nextInt();

                int d = sc.nextInt();

                int arr[] = { a , b ,c,d};
                System.out.println(CheckSorting(0,arr));




    



}
}

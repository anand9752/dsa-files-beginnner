import java.util.Scanner;
public class selectionsort {


    public static void printarr(int arr[]){
        for (int i = 0 ; i <arr.length; i ++){
            System.out.println(arr[i] + " ");
        } 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e = sc.nextInt();


        int arr[]= { a, b,c,d,e};
        for (int i= 0 ; i < arr.length - 1; i ++) {
            int smallest = i ;
            for (int j = i+1; j<arr.length; j++){
                if (arr[smallest]> arr[j]) {
                    smallest = j;
                    
                }
            }
            int temp = arr[smallest];
        
            arr[smallest]= arr[i];
            arr[i] = temp;
                }
        printarr(arr);
    }
    
}

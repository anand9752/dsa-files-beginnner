package divideandcon.pivotandpartition;



import java.util.Scanner;

public class quickSort {
    public static void QuickSort(int array[], int si , int ei){
if (si >= ei) {
    return;
    
}
   int pidx = partition(array,  si, ei);
   QuickSort(array, si, pidx);
   QuickSort(array, pidx+1, ei);

    }
    public static int partition(int array[], int si , int ei){
        int pivot = array[ei];
        int i = si -1;
        for (int j = si; j < ei; j++) {
            if (array[j]<= pivot) {
                i++; // i plus krkar jagah bnai
                //swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            
        }
    i++;
    int temp = pivot;
    array [ei] = array[i];
    array[i] = temp;
    return i ;


    }
  
    public static void printarray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {

        int array[]= new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
            
        }
        QuickSort(array, 0,array.length -1);
        printarray(array);
        
    }
    
}

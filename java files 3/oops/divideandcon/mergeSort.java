package divideandcon;


import java.util.Scanner;

public class mergeSort {
    public static void mergesort(int array[], int si , int ei){
if (si >= ei) {
    return;
    
}
int mid = (si + ei )/2;
mergesort(array, si,mid);  // left
mergesort(array, mid +1, ei);  // right
Merge(array, si, mid, ei);


    }
    public static void Merge(int array[], int si , int mid , int ei){
        int temp[]= new int[ei - si +1];
        int i = si;  // iteration for left array     
        int j = mid +1; //iteration for right array 
        int k = 0;  // for temp
        while (i<= mid && j <= ei) {
            if (array[i]<array[j]) {
                temp [k] = array[i];
                i ++;                
            } else {
                temp[k]= array[j];
                j++;

            }
            k++;
            
        }
        while (i <= mid) {
            temp[k++] = array [i++];

            
        }
        while ( j <= ei) {
            temp[ k ++] =array[j ++];

            
        }
        for (int k2 = 0 , l = si; k2 < temp.length ; k2++, l++) {
            array [l] = temp[k2];
            
        }

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
        mergesort(array, 0,array.length -1);
        printarray(array);
        
    }
    
}

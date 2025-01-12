/**
 * HeapSort
 */
public class HeapSort {
    

    public static void heapify(int arr[], int i, int size){

        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx =  left;
        }
        if(right <size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }
       
    }
    
      

    public static void heapsort(int[] arr){
    int n = arr.length;

    for(int i = n/2 ;i>=0;i--){
        heapify(arr,i,n);
    }

    //step 2   //swap and heap from end to first
    for(int i = n-1 ;i>0;i--){
        int t = arr[i];
        arr[i] = arr[0];
        arr[0] = t;


        //heapify
        heapify(arr, 0, i);
    
    }



    }


    public static void main(String[] args) {
        
        int arr[] = {23213,24213,124,542,24,65,12,34234,2,23,6,123,6,2123,66562,2}; 

        heapsort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
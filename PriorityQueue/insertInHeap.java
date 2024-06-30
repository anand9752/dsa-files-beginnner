import java.util.ArrayList;

public class insertInHeap {
    
    public static class Heap{
     
       static ArrayList<Integer> arr = new ArrayList<>();
        
        public  void addData(int data){
            arr.add(data);
            int a = arr.size()-1;
            int par = (a-1)/2;
            //swap
            while (arr.get(a) <arr.get(par)) {
                int temp = arr.get(a);
                arr.set(a, arr.get(par));
                arr.set(par,temp);
    

                a = par;
                par = (a-1)/2;
            }


        }

        //peek data
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            
            int l = 2*i +1;
            int r = 2*i+2;
            int minidx = i;
            if(l<arr.size() && arr.get(l) < arr.get(minidx)){
               minidx = l;
            }
            if(r<arr.size() && arr.get(r) < arr.get(minidx)){
                minidx = r;
             }
             if(minidx!= i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);

             }

             


        }
        //remove
        public int remove(){
            int rd = arr.get(0);

            //step 1 swap with last element due to removal is easy
           int temp = arr.get(arr.size()-1);
           arr.set(arr.size()-1, rd);
           arr.set(0, temp);

            //remove is done 


            arr.remove(arr.size()-1);
            heapify(0);
            return rd;
        }
    public static boolean isEmpty(){
        return arr.size() ==0;
    }


    }


    public static void main(String[] args) {
        

        Heap pq = new Heap();
        pq.addData(12);
        pq.addData(99);
        pq.addData(45);
        pq.addData(6);
        pq.addData(1);


        while (!pq.isEmpty()) {
           System.out.println(pq.peek());
           pq.remove();
        }
       
         
        
    }
}

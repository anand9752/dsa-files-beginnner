package stack;

  import java.util.Stack;

public class stackB { 

    public static void pushAtBottom(Stack<Integer> s , int data){
        while (s.isEmpty()) {
            s.push(data);
            return;


            
        }

      int top =  s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public boolean isEmpty() {
    //         return list.size()== 0;
    //     }

    //     // push
    //     public void push(int data){
    //         list.add(data);
    //     }

    //     //pop
    //     public int pop(){
    //         int top = list.get(list.size() -1);
    //         list.remove(list.size() -1);
    //         return top;

    //     }

    //     // peek
    //     public int peek(){
    //                     int top = list.get(list.size() -1);
    //                     return top;


    //     }
    
    

    public static void main(String[] args) { 
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
        
    }
}
  
    


package linked;

// import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class LinkedList{
    public static class Node {
    int data;
    Node next;

    public Node(int data ){
        this.data = data;
        this.next = null;

}}
public  static Node head; 
public static Node tail;

    

     public void add(int data ){
        Node newnode = new Node(data);

        if (head == null ) {
            System.out.println("empty");
            head = tail = newnode;
            return;
            
        }

        newnode.next = head;

        head = newnode;


    }

   public void print(){
        Node temp = head;
        if (head == null) {
            System.out.println("null");
            return;
            
        }
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;

            
        }
        System.out.println();
        
    }
//     public int search(){
//         Node temp =head ;

// int i = 0;
//         while (temp != null) {
//             if (temp.data == 3 ) {

//                 return i;

//             }
//             temp = temp.next;

//          i ++ ;
//         }
//         return -1;
//     }

  public void reverse(){
    Node curr = tail = head;
    Node prev = null;
   Node next;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
  
        
    }
 head = prev;



 }


    
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(1);
        list.add(2);
    list.add(3);

        list.add(22);

            list.add(5);
             list.print();
        //    System.out.println(list.search()); 

        list.reverse();
        list.print();


    
}


}


package linked;

// public class LinkedListr {
//     public static class Node {
//         int data;
//         Node Next;
//         public Node (int data){
//             this.data = data;
//             this.Next =null;

//         }
        
//     }
//     public static Node head;
//         public static Node tail;

//     // add node 
//     public void addfirst(int data){
//         // step 1 to create a new node 
//         Node newNode = new Node(data);
//         // if a single node that is head and tail
//         if (head ==null) {
//             head = tail = newNode;
            
//         }
//         // step 2 new node ka next me head ko add krna
//         newNode.Next = head; //link
//         // step 3 new node ka head ko head bnana hai
//         head  = newNode;
//     }

//   // for printing 
//   public void print(){
//         Node temp = head;

//     if (head == null ) {
//         System.out.println("empty");
//         return;
        
//     }
//     while (head != null) {
//         System.out.print(temp.data +" ");
//         temp = temp.Next;

        
//     }
//     System.out.println();
// return;
//   }


//   public static void main(String[] args) {
//         LinkedListr ll = new LinkedListr();
//         // ll.head = new Node(1);
//         // ll.head.Next =new Node(2);
//         ll.addfirst(1);
//         ll.addfirst(2);
//         ll.print();
        
//     }
    
// }
// A class to represent a node of the linked list
class Node {
  // Data part of the node
  int data;
  // Next pointer to the next node
  Node next;

  // Constructor to create a new node with given data
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

// A class to represent the linked list
class LinkedList {
  // Head pointer to the first node of the list
  Node head;

  // Constructor to create an empty list
  LinkedList() {
    this.head = null;
  }

  // A function to add a new node at the end of the list
  void add(int data) {
    // Create a new node with given data
    Node newNode = new Node(data);
    // If the list is empty, make the new node as the head
    if (this.head == null) {
      this.head = newNode;
      return;
    }
    // Otherwise, traverse the list till the last node
    Node current = this.head;
    while (current.next != null) {
      current = current.next;
    }
    // Link the new node to the last node
    current.next = newNode;
  }

  // A function to print the data of all nodes in the list
  
  void addbet(int idx , int data){
    Node newNode = new Node(data);
    Node temp = head;
    
    int i = 0;
    while (i < idx -1) {
        temp = temp.next;
        i ++;
        

        
    }
    newNode.next = temp.next;
        temp.next = newNode;
  }
  void print() {
    // If the list is empty, print a message and return
    if (this.head == null) {
      System.out.println("The list is empty");
      return;
    }
    // Otherwise, traverse the list and print each node's data
    Node current = this.head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}

// A class to test the linked list implementation
class Main {
  public static void main(String[] args) {
    // Create a new linked list object
    LinkedList list = new LinkedList();
    // Add some nodes to the list
    list.add(10);
    list.add(20);
    list.add(30);
    // Print the list
    list.print();

    list.addbet(1, 100);
    list.print();
  }
}

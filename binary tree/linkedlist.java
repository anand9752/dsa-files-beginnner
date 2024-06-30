public class linkedlist {
    Node head;
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data = data;
            this.next = null;

        }
    }

    public void addfirst(String data){
        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head= newNode;
    }


    public void addlast(String data){
        Node newNode = new Node();
        if(head == null){
            head = newNode;
            return;
        }   

        Node currnode = head;




       
        while(currnode.next != null){
            currnode = currnode.next;


        }
        currnode.next = newNode;
    }


    public void print(){

        if(head ==null){
            System.out.println("list is emptyu");
        }

    }





    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addfirst("a");
        list.addfirst("is");

        
    }
    
}

public class bst{


    static class Node{


        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     
    public static boolean search(Node root,int key){

        if (root == null) {
            return false;
            
        }
        if(root.data <key){
           return search(root.right, key);

        }else
        if (root.data > key) {
           return search(root.left, key);
            
        } 
        else  { 
            return true;
            
        } 
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right= new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(3423);


      System.out.println(search(root, 3423
      ));


    }
}
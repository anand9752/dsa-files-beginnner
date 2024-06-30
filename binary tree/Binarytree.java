import java.util.Scanner;

public class Binarytree {

    static Scanner sc = null;




    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        createTree();

    }






    static Node createTree(){

         Node root = null;

       
        System.out.println("Enter  data");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);


        System.out.println("enter left of " + data);

        root.left = createTree();

        System.out.println("enter right of" +data);
        root.right = createTree();

       

    
         return root;

    }

   

    
    
}







class Node {
    Node left,right;
    int data;

     public Node(int data){
        this.data = data;

        //default take right and left as a null 
        
    }
}

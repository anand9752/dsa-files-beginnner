import org.w3c.dom.Node;

public class mirrorABST {



    static class Node{
        int data;
        Node right,left;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }

    public static Node create(Node root,int val){

        if(root == null){
         root = new Node(val);
         return root;
        }
        if (root.data < val) {
            root.right= create(root.right, val);
            
        } else  {
            root.left=  create(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root ==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static Node mirror(Node root){
        if(root == null){
           
            return null;
        }
        
       Node one = mirror(root.left);
       Node two = mirror(root.right);
      root.left = two;
      root.right = one;
     
      return root; 
       
    }
    

      public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i < val.length; i++){
           root =   create(root, val[i]);
        }

        inorder(root);
        mirror(root);
        inorder(root);

        




    }


}

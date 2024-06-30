public class deleteANodeBST {
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

    public static Node delete(Node root , int val){
    
        if (root.data <val) {
            root.right =  delete(root.right, val);
            
        } else if (root.data > val) {
            root.left= delete(root.left, val);
        } else {
          //case 1 if val is at leaf
          if(root.left == null && root.right == null) {
             return null;
          }
          //case 2 if one left has chile and one right has null

          if(root.left==null){
            return root.right;
          } else if(root.right==null){
            return root.left;
          }

          //case 3 both havae child

          Node IS = ioSuccessor(root.right);
          root.data = IS.data;
          root.right= delete(root.right,IS.data); // after storing is data into root data , we have to add new node in root.left which had deleted left most node which is inorder successor


        }
       return root;


    }

    public static Node ioSuccessor(Node root){
        while (root.left!=null) {
            root = root.left;
            
        }
        return root;
    }



    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i < val.length; i++){
           root =   create(root, val[i]);
        }
        
        inorder(root);
        System.out.println();
        delete(root, 5);
        inorder(root);




    }
}

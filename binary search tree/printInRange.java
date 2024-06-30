public class printInRange {
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


    public static void printInRange(Node root,int k1,int k2){
        
        if (root==null) {
            return;
            
        }
        if(root.data >= k1 && root.data <= k2){
               printInRange(root.left, k1, k2);
               System.out.print(root.data+" ");
               printInRange(root.right, k1, k2);
        } else

        if (root.data < k1) {
            printInRange(root.right, k1, k2);
            
        } else
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
            
        }
    }



    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i < val.length; i++){
           root =   create(root, val[i]);
        }

        // inorder(root);

        printInRange(root, 3, 10);




    }
}

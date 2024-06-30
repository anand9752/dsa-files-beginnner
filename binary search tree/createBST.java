public class createBST {
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



    public static void main(String[] args) {
        int val[] = {5,
            1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < val.length; i++){
           root =   create(root, val[i]);
        }

        inorder(root);

    }
}

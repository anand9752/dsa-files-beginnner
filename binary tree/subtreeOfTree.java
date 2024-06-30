public class subtreeOfTree {
    static class Node {
        int data;
        Node right, left;
        Node (int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    
        
    }

    public static boolean isIdentical(Node root,Node subRoot){
      
        if (root == null && subRoot == null){
            return true;
            
        } else if(root ==null || subRoot == null || root.data != subRoot.data){

            return false;

        } 
        if (!isIdentical(root.left, subRoot.left)) {
            return false;
            
        }
        if (!isIdentical(root.right, subRoot.right)) {
            return false;
            
        }
        return true;

    }
   public static boolean isSubtree(Node root, Node subRoot){

    if (root == null) return false;
        
    
    if (root.data == subRoot.data) {

        
            return  isIdentical(root, subRoot);
        
    }

    boolean lf = isSubtree(root.left, subRoot);
    boolean rf = isSubtree(root.right, subRoot);
    return lf || rf;
   }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
        root.left.right = new Node(5);
        root.left.left = new Node(4);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));

        
    }
}
import java.util.ArrayList;

public class lowestCommonAncestor {
    static class Node {
        int data;
        Node left ,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
        
    }

    public static boolean getPath(Node root,int n,ArrayList<Node> path ){
        if (root==null) {
            return false;
            
        } 
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean lf = getPath(root.left, n, path);
        boolean rf = getPath(root.right, n, path);
        if (lf || rf) {
            return true;
            
        }
         
        path.remove(path.size()-1);



        return false;

    }
     

    public static Node lcaNode(Node root,int n1,int n2){
     
        ArrayList<Node> path1 = new ArrayList<Node>();
        ArrayList<Node> path2 = new ArrayList<Node>();


        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i =0;
        for(; i<path1.size() && i< path2.size();i++){

            if (path1.get(i) != path2.get(i)) {
                break;
                
            }
        }

       return path1.get(i-1); 





    }

    public static Node lca(Node root,int n1,int n2){
     
        if (root==null || root.data ==n1 || root.data ==n2){ 
            return root;
            
        }
        Node leftNode = lca(root.left,n1,n2);
        Node rightNode = lca(root.right,n1,n2);
        if (leftNode==null) {
            return rightNode;
            
        }
        if (rightNode==null) {
            return leftNode;
            
        }
        return root;


    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
        root.left.right = new Node(5);
        root.left.left = new Node(4);


                //    1
           //       /   \  

           //      2     3 
          //      / \    / \
           //     4  5   6  7 


        System.out.println(lcaNode(root, 6, 2).data);
        System.out.println(lca(root, 6, 7).data);
     
    
    }
}

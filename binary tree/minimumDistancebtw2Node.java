import org.w3c.dom.Node;

public class minimumDistancebtw2Node {
    static class Node {
        int data;
        Node left ,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
        
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
    

    public static int D_lca_n(Node root ,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int l = D_lca_n(root.left, n);
        int r = D_lca_n(root.right, n);
        if (l == -1 &&r == -1) {
            return -1;
            
        } else if(l==-1){
            return r+1;
        } else{
            return l+1;
        }

    }

    public static int minD(Node root,int n1,int n2){
        
        Node lca = lca(root, n1, n2);
        int d1 = D_lca_n(lca, n1);
        int d2 = D_lca_n(lca, n2);

        return d1+d2;
    }


    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        System.out.println(minD(root, 4, 7));
    }
}


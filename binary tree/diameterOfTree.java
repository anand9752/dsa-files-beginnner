public class diameterOfTree {
    


   
        static class Node {  
    
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
    
            }
        } 
    
     
        public static int height(Node root){
        
            // for count the no of nodes we return lh + rh +1
    
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            
             return  Math.max(lh, rh)+1;
        }



        public static int diameter(Node root){
        
            // for count the no of nodes we return lh + rh +1
    
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            
             return  Math.max(Math.max(rd,ld),lh+rh+1);
        }
         public static void main(String[] args) {
            
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            // root.right.left = new Node(6);
            // root.right.right =  new Node(7);
            root.left.right.left =new Node(7);
            root.left.right.left.left = new Node(4);
            root.left.left.right = new Node(9);   
            root.left.left.left = new Node(10);
            
           System.out.println(diameter(root));
    
         }
       
    
        
    }
    


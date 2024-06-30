import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfTree {
    
    static class Node {
        int data;
        Node left ,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
        
    }
    public static void preorder(Node root,int idx,int level){
        if (root == null) {
            
            return;
            
        }
        if(level ==idx){
            System.out.print(root.data +" ");
            return;
        }

        preorder(root.left,idx+1,level);
        preorder(root.right,idx+1,level);
    }
    


      public static void levelOrder(Node root,int level){
             
        int i =1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
          



            if (currNode == null) {
                i++;
                if (q.isEmpty()) {
                    break;
                    
                } else{
                   q.add(null); 
                }
                
                
            } else{

                if(i == level){
                    System.out.print(currNode.data +" ");
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                    
                }
                if (currNode.right!= null) {
                    q.add(currNode.right);
                    
                }
            }
            
        }
    }



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6); 
        root.right.right = new Node(7);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        levelOrder(root,3);
        System.out.println();
        preorder(root, 1, 3);


    }
    }


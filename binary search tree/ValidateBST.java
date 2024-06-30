
import java.util.*;
public class ValidateBST {
    static class Node {
        int data ;
        Node left,right;
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
    public static boolean isValidBST(Node root, Node max,Node min){
        if(root ==null){
            return true;
        }
        if(min !=null && root.data <= min.data){
            return false;
        } else if(max !=null && root.data >= max.data){
            return false;

    }
    return isValidBST(root.left, root, min) && isValidBST(root.right, max, root);

    }
    public static void main(String[] args) {
        int val[] = {1,1,1,1};
        Node root = null;
        for(int i = 0; i < val.length; i++){
           root =   create(root, val[i]);
        }
      System.out.println( isValidBST(root, null, null));
      Deque<Integer> dq = new LinkedList<>();
      dq.addFirst(1);
      dq.addLast(6);
      dq.addLast(3);
      dq.addFirst(19);
      System.out.println(dq);
        
       

    }

}

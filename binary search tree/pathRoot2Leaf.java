import java.util.*;

public class pathRoot2Leaf {
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


    //path from root to leaft

    public static void Root2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.left ==null &&root.right ==null){
          printPath(path);
          System.out.println();
          return;
        }
        Root2Leaf(root.left,path);
        Root2Leaf(root.right,path);

        path.remove(path.size()-1);
        return;

        
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){

         System.out.print(path.get(i) + "-> ");
        }
        System.out.print("NUll");
        
    }



    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i < val.length; i++){
           root =   create(root, val[i]);
        }

        // inorder(root);
        ArrayList<Integer> path = new ArrayList<Integer>();

        Root2Leaf(root,path);

    }
}

import java.util.*;

public class topViewOfTree {
    static class Node {
        int data ;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        Node node;
        int hd;
        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    
    }


    public static void topView(Node root ){

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        q.add( new Info(root,0));
        q.add(null);

        int max=0, min =0;
        while (!q.isEmpty()) {
                
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                    
                } else{
                    q.add(null);
                }
                
            } else{

            


                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                    
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd -1));
                    min = Math.min(curr.hd-1,min);


                    
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd +1));
                    max = Math.max(curr.hd+1,max);
                    

                    
                }
            }
            

 


            
        }

        for(int i = min ; i <= max ; i++){
            System.out.print(map.get(i).data + " ");
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

        topView(root);
        
    }
}

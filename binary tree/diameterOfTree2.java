public class diameterOfTree2 {
    

   static class Node{
    int data;
    Node left, right;
       
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
   }
   static class Info{
    int dia;
    int ht;
     Info(int dia, int ht){
          this.dia = dia;
          this.ht = ht;
     }
   }
   public static Info diameter(Node root){

    if (root == null) {
        return new Info(0,0);
        
    }

    Info leftInfo = diameter(root.left);
    Info rightInfo = diameter(root.right);
    int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia),leftInfo.ht + rightInfo.ht+1);

    int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
    return new Info(dia,ht);
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


            System.out.println(diameter(root).dia);
    }
}

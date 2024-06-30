public class SizeOfLargestBST {
    
    static class  Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    
        
    }
     
    public static int sum = 0;

    public static class Info{
         boolean isValid;
        int size;
        int max;
        int min;
        Info(boolean isValid, int size, int max,int min){
           this.isValid = isValid;
            this.size  = size;
            this.max = max;
            this.min = min;
        }
    }

   public static Info InfoOfBST(Node root){
   

    if(root==null){
        return new Info(true , 0 , Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    Info leftsub = InfoOfBST(root.left );
    Info rightsub = InfoOfBST(root.right);
    int size = leftsub.size + rightsub.size +1;
    int min = Math.min(root.data, Math.min(leftsub.min , rightsub.min));
    int max = Math.max(root.data, Math.max(leftsub.max , rightsub.max));

    

    if(root.data <= leftsub.max || root.data >= rightsub.min ){
       return new Info(false, size , min ,max);
    } 
    if(leftsub.isValid && rightsub.isValid ){
        sum = Math.max(sum,size);
        return new Info(true, size , min ,max);
     } 
 


    return new Info(false, size, min,max);



   }
    



    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new  Node (65);
        root.right.right.right = new Node(80);

       /* 
                      50
                    /    \
                   30     60
                 /   \    /   \
                5    20   45   70
                              /  \
                             65   80
       
       */             
    
    //  System.out.println(sum);/
    Info result = InfoOfBST(root);
     System.out.println(result.isValid);
    System.out.println(sum);


     
        
    }
}

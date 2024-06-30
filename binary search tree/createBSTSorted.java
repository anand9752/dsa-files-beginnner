public class createBSTSorted {
    
    static class Node {
        int data;
        Node left, right;
        Node (int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }


    public static Node createBST(int[] arr, int start,int end){
       if(start >end){
        return null;

       }

        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    public static void inorder(Node root){
        if(root ==null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};

    Node rr = createBST(arr, 0, arr.length-1);
    inorder(rr);



    }
}

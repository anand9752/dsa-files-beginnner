import java.util.ArrayList;

public class merge2BST{

 static class Node {
    int data;
    Node left,right ;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right= null;

    }
 }
    
 public static void getInorder(Node root , ArrayList<Integer> arr){
    if(root == null){
        return;
    }


    getInorder(root.left , arr);
    arr.add(root.data);
    getInorder(root.right, arr);
 }



    public static Node createBST(ArrayList<Integer> arr,int start , int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr.get(mid));
       root.left = createBST(arr, start, mid-1);
       root.right=  createBST(arr,mid+1, end);
         
        return root;
    }

    public  static void merging(Node root1,Node root2){
       
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        ArrayList<Integer> finalarr= new ArrayList<>();
        int i=0,j  =0;
        while( i< arr1.size() && j< arr2.size()){
              
            if(arr1.get(i) < arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            } else  {
                if(arr1.get(i) > arr2.get(j)){
                    finalarr.add(arr2.get(j));
                    j++;
            }
        }
        while (i< arr1.size()) {
            finalarr.add(arr1.get(i));
            i++;
            
        }
        while (j< arr2.size()) {
            finalarr.add(arr2.get(j));
            j++;
            
        }

        Node result =  createBST(finalarr , 0 , finalarr.size()-1);
        ArrayList<Integer> ans = new ArrayList<>();
        getInorder(result,ans);
        for(int num : ans){
            System.out.println(num);
        }
      
    }
        
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        merging(root1, root2);

    }
}